
package model;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexao {
    private static Connection conexao = null;
    public static Connection getConexao() throws ClassNotFoundException{
        if(conexao != null){
            return conexao;
        }
    
        else{
            try{
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/sigma";
                String user = "root";
                String password = "bancodedados";
            
                Class.forName(driver);
                conexao = DriverManager.getConnection(url,user,password);
                
                JOptionPane.showMessageDialog(null,"Conectado");


            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "deu pau duas vezes \n"+e);
            }
            return conexao;
        }
    }
}
