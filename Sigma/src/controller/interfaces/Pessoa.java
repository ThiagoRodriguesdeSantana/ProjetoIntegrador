/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.interfaces;

import controller.People;
import java.sql.SQLException;
import java.util.ArrayList;

public interface Pessoa {
    
       public void incluir(People objeto)throws SQLException;
       public void Atualizar(People objeto)throws SQLException;
       public void Deletar(int ID);
       public ArrayList<People> buscar(String nome) throws  SQLException;
}
