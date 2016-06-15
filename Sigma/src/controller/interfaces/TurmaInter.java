
package controller.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import controller.Turma;

public interface TurmaInter {
    
     public void incluir(Turma objeto)throws SQLException;
    public ArrayList<Turma> listar(Turma objeto) throws  SQLException;
    public void update(Turma objeto)throws SQLException;
    public void Delet(int ID);
    public ArrayList<Turma> buscar(String nome) throws  SQLException;
}
