
package controller.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import controller.Professor;

public interface ProfessorInter {
    
    public void incluir(Professor objeto)throws SQLException;
    public ArrayList<Professor> listar(Professor objeto) throws  SQLException;
    public void update(Professor objeto)throws SQLException;
    public void excluir(int ID)throws SQLException;
    public ArrayList<Professor> buscar(String nome) throws  SQLException;
}
