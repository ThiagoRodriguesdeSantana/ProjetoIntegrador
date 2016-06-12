/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import controller.Pessoa;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import controller.interfaces.Aluno;

public class DAOAluno implements Pessoa{
     private Connection conectar = null;
     private PreparedStatement ps;
    

    public void incluir(Pessoa objeto) throws SQLException {
        
        
        String inserir = "insert into pessoa(id_pessoa, nome, cpf, endereco, senha, tipo)values(?,?,?,?,?,?)"; 
        ps = conectar.prepareStatement(inserir);
        ps.setInt(1, objeto.getId());
        ps.setString(2, objeto.getNome());
        ps.setLong(3, objeto.getCpf());
        ps.setString(4, objeto.getAddress());
        ps.setString(5, objeto.getPassword());
        ps.setInt(6, objeto.getType());
        
        ps.executeQuery();
        
        
        }

    @Override
    public void Atualizar(Pessoa objeto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletar(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pessoa> buscar(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
