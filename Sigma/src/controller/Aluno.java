
package controller;

import static javax.swing.text.html.HTML.Tag.HEAD;

public class Aluno extends Pessoa{
    
    private String curso;
    private int estado;

    
    public Aluno(){
        
    }

    public Aluno(String nome, String cpf, String endereco, String telefone, String senha, int tipo,int estado) {
        super(nome, cpf, endereco, telefone, senha, tipo);
        this.estado = estado;
    }
    
    
    
    public Aluno(int id, String nome, String cpf, String endereco,String telefone, String senha, int tipo, String curso,int estado ) {
        super(id, nome, cpf, telefone, endereco, senha, tipo);
        this.curso = curso;
        this.estado = estado;
    }
    

    public String getCurso() { return curso;}
    public void setCurso(String curso) { this.curso = curso;}
    public void setEstado(int estado) { this.estado = estado; }
    public int getEstado(){return estado;}

    
}
