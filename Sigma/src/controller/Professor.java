
package controller;

public class Professor extends Pessoa{
    
    private int titulacao;
    

    public Professor(int id, String nome, String cpf, String endereco,String telefone, String senha, int tipo,int titulacao) {
        super(id, nome, cpf, endereco,telefone, senha, tipo);
        this.titulacao = titulacao;
    }
  
    public Professor(){
        
    }
   

    public int getTitulacao() { return titulacao;}
    public void setTitulacao(int titulacao) { this.titulacao = titulacao;}
  
    
}
