
package controller;

import static javax.swing.text.html.HTML.Tag.HEAD;

public class Aluno extends Pessoa{
    
    private String curso;
    private int estado;

    
    public Aluno(){
        
    }
    
<<<<<<< HEAD
    public Aluno(int id, String nome, String cpf, String endereco,String telefone, String senha, int tipo, String curso,String situacao ) {
=======
    public Aluno(int id, String nome, String cpf, String endereco,String telefone, String senha, int tipo, String curso,int estado ) {
>>>>>>> 45d80c1a9ee5fd831c226f6ed9f78981a13ebd2d
        super(id, nome, cpf, telefone, endereco, senha, tipo);
        this.curso = curso;
        this.estado = estado;
    }
    

    public String getCurso() { return curso;}
    public void setCurso(String curso) { this.curso = curso;}
    public void setEstado(int estado) { this.estado = estado; }
    public int getEstado(){return estado;}

    
}
