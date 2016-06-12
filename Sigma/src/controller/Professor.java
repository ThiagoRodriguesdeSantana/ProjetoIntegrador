
package controller;

public class Professor extends Pessoa{
    
    private String titulacao;
    

    public Professor(int id, String nome, String cpf, String endereco,String telefone, String senha, int tipo,String titulacao) {
        super(id, nome, cpf, endereco,telefone, senha, tipo);
        this.titulacao = titulacao;
    }

    public Professor(int aInt, String string, String string0, String string1, String string2, int aInt0, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulacao() { return titulacao;}
    public void setTitulacao(String titulacao) { this.titulacao = titulacao;}
  
    
}
