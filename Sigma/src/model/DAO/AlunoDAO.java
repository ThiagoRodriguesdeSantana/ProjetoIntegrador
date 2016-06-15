package model.DAO;

import controller.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Conexao;


public class AlunoDAO {
    private Connection conectar = null;
    
    public AlunoDAO(){
        conectar = Conexao.getConexao();
    }
    
    public void incluir(Aluno aluno)throws SQLException{
        String comando = "insert into aluno(nome,cpf,endereco,senha,id_tipo,id_estado,telefone)values(?,?,?,?,?,?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,aluno.getNome());
        ps.setString(2,aluno.getCpf());
        ps.setString(3, aluno.getEndereco());
        ps.setString(4,aluno.getSenha());
        ps.setInt(5,aluno.getTipo());
        ps.setInt(6,aluno.getEstado());
        ps.setString(7,aluno.getTelefone());
        ps.executeUpdate();
    }
    
    public ArrayList listar() throws SQLException{
        ArrayList dados = new ArrayList();
        String comando = "select * from aluno";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Aluno pessoa = new Aluno();
            pessoa.setId(rs.getInt("id_aluno"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setEndereco(rs.getString("endereco"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setTipo(rs.getInt("id_tipo"));
            pessoa.setEstado(rs.getInt("id_estado"));
            pessoa.setTelefone(rs.getString("telefone"));
            
            
            dados.add(pessoa);
        }
        return dados;
    }
    
    public void excluir(int id)throws SQLException{
        String comando = "delete from aluno where id_aluno = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setInt(1, id);;
        ps.executeUpdate();
    }
    
    public Aluno consultar(String nome)throws SQLException{
        String comando = "select * from aluno where nome like ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,nome);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Aluno aluno = new Aluno();
            aluno.setId(rs.getInt("id_aluno"));
            aluno.setNome(rs.getString("nome"));
            aluno.setCpf(rs.getString("cpf"));
            aluno.setEndereco(rs.getString("endereco"));
            aluno.setSenha(rs.getString("senha"));
            aluno.setTipo(rs.getInt("id_tipo"));
            aluno.setEstado(rs.getInt("id_estado"));
            aluno.setTelefone(rs.getString("telefone"));
            
            
            return aluno;
        }
        return null;
    }
    
    public void alterar (Aluno aluno)throws SQLException{
        String comando = "update aluno set nome=?, cpf=? , endereco=?,id_tipo=? , id_estado=?,telefone=? where id = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,aluno.getNome());
        ps.setString(2,aluno.getCpf());
        ps.setString(3, aluno.getEndereco());
        ps.setInt(4,aluno.getTipo());
        ps.setInt(5,aluno.getEstado());
        ps.setString(6,aluno.getTelefone());
        ps.setInt(7,aluno.getId());
        ps.executeUpdate();
    }
}
