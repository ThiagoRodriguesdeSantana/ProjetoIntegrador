
package controller;

public class Teacher extends People{
    
    private String titulacao;
    private String disciplina;

    public Teacher(int id, String nome, long cpf, String endereco,String telefone, String senha, int tipo,String titulacao) {
        super(id, nome, cpf, endereco,telefone, senha, tipo);
        this.titulacao = titulacao;
    }


    public String getTitulacao() { return titulacao;}
    public void setTitulacao(String titulacao) { this.titulacao = titulacao;}
    public String getDisciplina() {return disciplina;}
    public void setDisciplina(String disciplina) {this.disciplina = disciplina;}
    
}
