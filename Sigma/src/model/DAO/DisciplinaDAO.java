package model.DAO;

import controller.Disciplina;
import controller.interfaces.DISCIPLINA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Conexao;

public class DisciplinaDAO implements DISCIPLINA {
    private Connection conectar = null;
    
    public DisciplinaDAO(){
        conectar = Conexao.getConexao();
    }
    
    public void incluir(Disciplina disciplina) throws SQLException {
        String comando = "insert into Disciplina(desc_disciplina,ementa,bibliografia,prerequisito,id_perido,id_professor)values(?,?,?,?,?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,disciplina.getDesc());
        ps.setString(2,disciplina.getEmenta());
        ps.setString(3, disciplina.getBibliografia());
        ps.setString(4,disciplina.getPreRequisito());
        ps.setInt(5,disciplina.getPeriodo());
        ps.setInt(6,disciplina.getProfessor());
        ps.executeUpdate();
    }

    @Override
    public ArrayList listar() throws SQLException{
        ArrayList dados = new ArrayList();
        String comando = "select * from disciplina";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Disciplina disciplina = new Disciplina();
            disciplina.setId(rs.getInt("id_disciplina"));
            disciplina.setDesc(rs.getString("desc_disciplina"));
            disciplina.setEmenta(rs.getString("ementa"));
            disciplina.setBibliografia(rs.getString("bibliografia"));
            disciplina.setPreRequisito(rs.getString("prerequisito"));
            disciplina.setPeriodo(rs.getInt("id_periodo"));
            disciplina.setProfessor(rs.getInt("id_professor"));
            dados.add(disciplina);
        }
        return dados;
    }

    public void excluir(int id)throws SQLException{
        String comando = "delete from disciplina where id_disciplina = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setInt(1, id);;
        ps.executeUpdate();
    }

    @Override
    public Disciplina consultar(String nome) throws SQLException {
    String comando = "select * from disciplina where nome = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,nome);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Disciplina disciplina = new Disciplina();
            disciplina.setId(rs.getInt("id_disciplina"));
            disciplina.setDesc(rs.getString("desc_disciplina"));
            disciplina.setEmenta(rs.getString("ementa"));
            disciplina.setBibliografia(rs.getString("bibliografia"));
            disciplina.setPreRequisito(rs.getString("prerequisito"));
            disciplina.setPeriodo(rs.getInt("id_periodo"));
            disciplina.setProfessor(rs.getInt("id_professor"));
            
            return disciplina;
        }
        return null;
    }

    @Override
    public void alterar(Disciplina disciplina) throws SQLException {
        String comando = "update disciplina set desc_disciplina=?, ementa=? , bibliografia=? ,prerequisito=?,id_periodo=? , id_professor =? where id = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,disciplina.getDesc());
        ps.setString(2,disciplina.getEmenta());
        ps.setString(3, disciplina.getBibliografia());
        ps.setString(4,disciplina.getPreRequisito());
        ps.setInt(5,disciplina.getPeriodo());
        ps.setInt(6,disciplina.getProfessor());
        ps.setInt(7,disciplina.getId());
        ps.executeUpdate();
    }
    
}
