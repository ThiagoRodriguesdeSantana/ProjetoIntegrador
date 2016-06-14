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
public class Titulacao {
     private int id;
    private String descricao;
    
    private Connection conectar = null;
    
    public Titulacao(){
        conectar = Conexao.getConexao();
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao; }
    
    
    public ArrayList listar() throws SQLException{
        ArrayList dados = new ArrayList();
        String comando = "select * from titulacao";
        PreparedStatement ps = conectar.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Titulacao titulacao = new Titulacao();
            titulacao.setId(rs.getInt("id_titulacao"));
            titulacao.setDescricao(rs.getString("desc_titulacao"));
            dados.add(titulacao);
        }
        return dados;
    }
}
