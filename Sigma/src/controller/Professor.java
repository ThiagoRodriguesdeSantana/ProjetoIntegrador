
package controller;

public class Professor extends Pessoa{
    
    private int titulacao;
    

    public Professor(){
        
    }
    
    public Professor(int id, String nome, String cpf, String endereco,String telefone, String senha, int tipo,int titulacao) {
        super(id, nome, cpf, endereco,telefone, senha, tipo);
        this.titulacao = titulacao;
    }
    
    public Professor(String nome, String cpf, String endereco,String telefone, String senha, int tipo,int titulacao) {
        super(nome, cpf, endereco,telefone, senha, tipo);
        this.titulacao = titulacao;
    }

   

    public int getTitulacao() { return titulacao;}
    public void setTitulacao(int titulacao) { this.titulacao = titulacao;}
  
    
}
