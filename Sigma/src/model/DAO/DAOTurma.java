
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import controller.Turma;
import controller.interfaces.TurmaInter;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class DAOTurma implements TurmaInter{
    
     private Connection conectar = null;
     private PreparedStatement ps; 

    public DAOTurma() {
    }
     
    // int id, String descricao, int ano, String horario, int idDias, int idCurso

    @Override
    public void incluir(Turma objeto) throws SQLException {
    String comando = "insert into turma( id,  descricao,  ano,  horario,  idDias,  idCurso) values(?,?,?,?,?,?)";
        ps = conectar.prepareStatement(comando);
        ps.setInt(1, objeto.getId());
        ps.setString(2, objeto.getDescricao());
        ps.setInt(3, objeto.getAno());
        ps.setString(4, objeto.getHorario());
        //ps.setInt(5, objeto.getIdDias());
        ps.setInt(6, objeto.getIdCurso());
       
        ps.executeUpdate();
        ps.close();
       
    }
    

    @Override
    public ArrayList<Turma> listar(Turma objheto) throws SQLException {

              
        
       ArrayList<Turma> lista = new ArrayList<>();
       
        String comandoSelect = "select  id,  descricao,  ano,  horario,  idDias,  idCurso from turma";
   
       
            PreparedStatement psS = conectar.prepareStatement(comandoSelect);
           
            
            ResultSet rs = psS.executeQuery();
            // int id, String descricao, int ano, String horario, int idDias, int idCurso
            while(rs.next()){
                lista.add(new Turma
                (rs.getInt(1),
                 rs.getString(2),
                 rs.getInt(3),
                 rs.getString(4),
                 
                 rs.getInt(6)
                ));
            }
            
      return lista;
    }

    @Override
    public void update(Turma objeto) throws SQLException {
 // int id, String descricao, int ano, String horario, int idDias, int idCurso
        
              String editar = "update turma set descricao  = ?, ano = ?, horario = ?, idDias = ?, idCurso = ? where id = ? ";
        try {
      
        ps = conectar.prepareStatement(editar);
        
        ps.setString(1, objeto.getDescricao());
        ps.setInt(2, objeto.getAno());
        ps.setString(3, objeto.getHorario());
        //ps.setInt(4, objeto.getIdDias());
        ps.setInt(5, objeto.getIdCurso());
         ps.setInt(6, objeto.getId());
        
        
        ps.executeUpdate();
        ps.close();
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void Delet(int ID) {
        Turma turma = new Turma();
 
         try {
            String delet = "DELETE FROM turma WHERE ID = ?";
           ps = conectar.prepareStatement(delet);
            ps.setInt(1,turma.getId());
             ps.execute();
             ps.close();
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public ArrayList<Turma> buscar(String nome) throws SQLException {
  ArrayList<Turma> busca = new ArrayList<>();
       
        String consulta = "select  * from turma where id = ?";
        
         ps = conectar.prepareStatement(consulta);
         ps.setString(1, nome);
         ResultSet rs2 = ps.executeQuery();
            
            while(rs2.next()){
                busca.add(new Turma
                (rs2.getInt(1),
                 rs2.getString(2),
                 rs2.getInt(3),
                 rs2.getString(4),
                
                 rs2.getInt(6)
                
                ));
            }

        return busca;
        
        
    }
    
    
    
}
