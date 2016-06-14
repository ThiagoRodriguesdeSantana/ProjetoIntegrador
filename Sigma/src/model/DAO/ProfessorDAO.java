
package model.DAO;

import controller.Professor;
import controller.interfaces.ProfessorInter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Conexao;


    public class ProfessorDAO implements ProfessorInter{
       private Connection conectar = null;
       private PreparedStatement ps; 
       
       public ProfessorDAO() throws ClassNotFoundException{
            conectar = Conexao.getConexao();
       }

    @Override
    public void incluir(Professor objeto) throws SQLException {

        String comando = "insert into professor(NOME, CPF, ENDERECO, SENHA, ID_TIPO,ID_TITULACAO,TELEFONE)values(?,?,?,?,?,?,?)";
        ps = conectar.prepareStatement(comando);
        ps.setString(1, objeto.getNome());
        ps.setString(2, objeto.getCpf());
        ps.setString(3, objeto.getEndereco());
        ps.setString(4, objeto.getSenha());
        ps.setInt(5, objeto.getTipo());
        ps.setInt(6, objeto.getTitulacao());
        ps.setString(7,objeto.getTelefone());
        ps.executeUpdate();
       
    }

    @Override
    public ArrayList<Professor> listar(Professor objeto) throws SQLException {
 
              ArrayList<Professor> lista = new ArrayList<>();
       
        String comandoSelect = "select * from professor";
   
       
            PreparedStatement psS = conectar.prepareStatement(comandoSelect);
           
          
            ResultSet rs = psS.executeQuery();
            
            while(rs.next()){
                lista.add(new Professor     
                            (rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getInt(7),
                                rs.getInt(8)
                            ));        
                       
            }
            
      return lista;
    
    }

    @Override
    public void update(Professor objeto) throws SQLException {
          String editar = "update professor set NOME  = ?, CPF = ?, ENDERECO = ?, SENHA = ?, ID_TIPO = ?,ID_TITULACAO = ?, TELEFONE = ? where id = ? ";
        try {
      
        ps = conectar.prepareStatement(editar);
        ps.setString(1, objeto.getNome());
        ps.setString(2, objeto.getCpf());
        ps.setString(3, objeto.getEndereco());
        ps.setString(4, objeto.getSenha());
        ps.setInt(5, objeto.getTipo());
        ps.setInt(6, objeto.getTitulacao());
        ps.setString(7, objeto.getTelefone());
        
        ps.executeUpdate();
      
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
    }

    @Override
    public void Delet(int ID) {
 
           Professor professor = new Professor();
        professor.setId(ID);
       
        try {
            String delet = "DELETE FROM agendamentos WHERE ID = ?";
           ps = conectar.prepareStatement(delet);
            ps.setInt(1,professor.getId());
             ps.execute();
             ps.close();
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public ArrayList<Professor> buscar(String nome) throws SQLException {
        
           ArrayList<Professor> busca = new ArrayList<>();
       
        String consulta = "select id, nome, telefone, email, endereco, cpf, bairro from agendamentos where nome = ?";
        
         ps = conectar.prepareStatement(consulta);
         ps.setString(1, nome);
         ResultSet rs2 = ps.executeQuery();
            
            while(rs2.next()){
                
                busca.add(new Professor     
                            (rs2.getInt(1),
                                rs2.getString(2),
                                rs2.getString(3),
                                rs2.getString(4),
                                rs2.getString(5),
                                rs2.getString(6),
                                rs2.getInt(7),
                                rs2.getInt(8)
                            ));        
                       
            }

        return busca;
        
    }
  
}
