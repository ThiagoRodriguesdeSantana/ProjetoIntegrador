package controller.interfaces;

import controller.Disciplina;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DISCIPLINA {
      public void incluir(Disciplina disciplina) throws SQLException;
    public ArrayList listar()throws SQLException;
    public void excluir(int id)throws SQLException;
    public Disciplina consultar(String nome)throws SQLException;
    public void alterar(Disciplina disciplina) throws SQLException;
}
