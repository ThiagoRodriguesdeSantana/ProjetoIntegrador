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
        String comando = "insert into Contatos(cpf,endereco,id_aluno,id_estado,id_tipo,nome,senha)values(?,?,?,?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,aluno.getCpf());
        ps.setString(2, aluno.getEndereco());
        ps.setInt(3,aluno.getId());
        ps.setInt(4,aluno.getEstado());
        ps.setInt(5,aluno.getTipo());
        ps.setString(6,aluno.getNome());
        ps.setString(7,aluno.getSenha());
        ps.executeUpdate();
    }
    
    public ArrayList listar() throws SQLException{
        ArrayList dados = new ArrayList();
        String comando = "select * from alunos";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Aluno pessoa = new Aluno();
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setEndereco(rs.getString("endereco"));
            pessoa.setId(rs.getInt("id_aluno"));
            pessoa.setEstado(rs.getInt("id_estado"));
            pessoa.setTipo(rs.getInt("id_tipo"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setSenha(rs.getString("senha"));
            dados.add(pessoa);
        }
        return dados;
    }
    
    public void excluir(String nome)throws SQLException{
        String comando = "delete from alunos where nome = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, nome);;
        ps.executeUpdate();
    }
}
