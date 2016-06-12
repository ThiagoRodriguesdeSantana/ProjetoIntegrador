
package model.DAO;

import controller.Professor;
import controller.interfaces.ProfessorInter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProfessorDAO implements ProfessorInter{
       private Connection conectar = null;
     private PreparedStatement ps; 

    @Override
    public void incluir(Professor objeto) throws SQLException {

        String comando = "insert into professor(ID_PROFESSOR, NOME, CPF, ENDERECO, SENHA, ID_TIPO,ID_TITULACAO)values(?,?,?,?,?,?,?)";
        ps = conectar.prepareStatement(comando);
        ps.setInt(1, objeto.getId());
        ps.setString(2, objeto.getNome());
        ps.setString(3, objeto.getCpf());
        ps.setString(4, objeto.getEndereco());
        ps.setString(5, objeto.getSenha());
        ps.setInt(6, objeto.getTipo());
        ps.setString(7, objeto.getTitulacao());
        ps.executeUpdate();
       
    }

    @Override
    public ArrayList<Professor> listar(Professor objeto) throws SQLException {
 
              ArrayList<Professor> lista = new ArrayList<>();
       
        String comandoSelect = "select ID_PROFESSOR, NOME, CPF, ENDERECO, SENHA, ID_TIPO, ID_TITULACAO from professor";
   
       
            PreparedStatement psS = conectar.prepareStatement(comandoSelect);
           
            
            ResultSet rs = psS.executeQuery();
            
            while(rs.next()){
                lista.add(new Professor
                (rs.getInt(1),
                 rs.getString(2),
                 rs.getString(3),
                 rs.getString(4),
                 rs.getString(5),
                 rs.getInt(6),
                 rs.getString(7)
                ));
            }
            
      return lista;
    
    }

    @Override
    public void update(Professor objeto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delet(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Professor> buscar(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
}
