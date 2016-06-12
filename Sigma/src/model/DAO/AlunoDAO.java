package model.DAO;

import controller.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Conexao;

public class AlunoDAO {
    private Connection conectar = null;
    
    public AlunoDAO(){
        conectar = Conexao.getConexao();
    }
    
    public void incluir(Aluno aluno)throws SQLException{
        String comando = "insert into Contatos(nome,telefone,email,endereco,cpf)values(?,?,?,?,?)";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ps.setString(1,aluno.getNome());
        ps.setLong(2, aluno.getTelefone());
        ps.setString(3,aluno.getEmail());
        ps.setString(4,aluno.getEndereco());
        ps.setLong(5, aluno.getCPF());
        ps.executeUpdate();
    }
}
