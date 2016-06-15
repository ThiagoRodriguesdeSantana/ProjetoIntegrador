
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
//                String driver = "com.mysql.jdbc.Driver";
//                String url = "jdbc:mysql://localhost/sigma";
//<<<<<<< HEAD
//                String user = "sigma";
//                String password = "bancodedados";
//=======
//                String user = "root";
//                String password = "root12";
//>>>>>>> c5f99e1303a3ffbac1bd86bd4bd7b04beb6218a0
                String driver = "com.mysql.jdbc.Driver";
<<<<<<< HEAD
                String url = "jdbc:mysql://127.0.0.1:3306/sigma";
                String user = "root";  
                String password = "bancodedados";
               
=======
                String url = "jdbc:mysql://localhost/sigma";


                String user = "root";
                String password = "root12";

            
>>>>>>> 3a5a619eab6e9828cdd2bd08586883098cf9b526
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
