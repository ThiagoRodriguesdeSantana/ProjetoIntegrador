/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Conexao;

/**
 *
 * @author bruno
 */
public class Estado {
     private int id;
    private String descricao;
    
    private Connection conectar = null;
    
    public Estado(){
        conectar = Conexao.getConexao();
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao; }
    
    
    public ArrayList listar() throws SQLException{
        ArrayList dados = new ArrayList();
        String comando = "select * from estado";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Estado estado = new Estado();
            estado.setId(rs.getInt("id_estado"));
            estado.setDescricao(rs.getString("desc_estado"));
            dados.add(estado);
        }
        return dados;
    }
}
