
package model;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexao {
    private static Connection conexao = null;
    public static Connection getConexao(){
        if(conexao != null){
            return conexao;
        }
    
        else{
            try{
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/sigma";

                String user = "sigma";
                String password = "bancodedados";

//                String user = "root";
//                String password = "root12";

            
                Class.forName(driver);
                conexao = DriverManager.getConnection(url,user,password);

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }catch(SQLException e){
                e.printStackTrace();
            }
            return conexao;
        }
    }
}
