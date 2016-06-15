/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Thiago Poeta
 */
public class Turma {
    
    private int id;
    private String descricao;
    private int ano;
    private String horario;
    //private int idDias;
    private int idCurso;
    
    public Turma(Turma turma){
     
    }

    public Turma(int id, String descricao, int ano, String horario, int idCurso) {
        this.id = id;
        this.descricao = descricao;
        this.ano = ano;
        this.horario = horario;
       // this.idDias = idDias;
        this.idCurso = idCurso;
    }

    public Turma() {
    }
    
    public Turma(String descricao, int ano, String horario, int idCurso){
       this.descricao = descricao;
        this.ano = ano;
        this.horario = horario;
        this.idCurso = idCurso; 
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

  
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the idDias
     */
//    public int getIdDias() {
//        return idDias;
//    }
//
//    public void setIdDias(int idDias) {
//        this.idDias = idDias;
//    }
    public int getIdCurso() {
        return idCurso;
    }

    
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
    
    
    
}
