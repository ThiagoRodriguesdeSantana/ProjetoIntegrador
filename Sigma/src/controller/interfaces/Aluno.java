/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Aluno {
    
       public void incluir(controller.Pessoa objeto)throws SQLException;
       public void Atualizar(controller.Pessoa objeto)throws SQLException;
       public void Deletar(int ID);
       public ArrayList<controller.Pessoa> buscar(String nome) throws  SQLException;
}
