
package controller;

public class Student extends People{
    
    private String curso;
    private String situacao;

    
    
    public Student(int id, String nome, long cpf, String endereco,String telefone, String senha, int tipo, String curso,String situacao ) {
        super(id, nome, cpf, telefone, endereco, senha, tipo);
        this.curso = curso;
        this.situacao = situacao;
    }
    

    public String getCurso() { return curso;}
    public void setCurso(String curso) { this.curso = curso;}
    public void setSituacao(String situacao) { this.situacao = situacao; }

    
}
