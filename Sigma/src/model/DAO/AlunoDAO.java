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
        String comando = "insert into Contatos(id_aluno,nome,cpf,endereco,senha,id_tipo,id_estado,telefone)values(?,?,?,?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setInt(1,aluno.getId());
        ps.setString(2,aluno.getNome());
        ps.setString(3,aluno.getCpf());
        ps.setString(4, aluno.getEndereco());
        ps.setString(5,aluno.getSenha());
        ps.setInt(6,aluno.getTipo());
        ps.setInt(7,aluno.getEstado());
        ps.setString(8,aluno.getTelefone());
        
        
        
        ps.executeUpdate();
    }
    
    public ArrayList listar() throws SQLException{
        ArrayList dados = new ArrayList();
        String comando = "select * from alunos";
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
    
    public void excluir(String nome)throws SQLException{
        String comando = "delete from alunos where nome = ?";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1, nome);;
        ps.executeUpdate();
    }
}
