package controller.interfaces;

import controller.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ALUNO {
    public void incluir(Aluno aluno) throws SQLException;
    public ArrayList listar()throws SQLException;
    public void excluir(String nome)throws SQLException;
    public Aluno consultar(String nome)throws SQLException;
    public void alterar(Aluno aluno) throws SQLException;
}
