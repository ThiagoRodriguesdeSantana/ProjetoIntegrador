
package controller;

public abstract class Pessoa {
    
    protected int Id;
    protected long cpf;
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected int tipo;
    protected String senha;
    
    public Pessoa(){
        
    }
    
    public Pessoa(int id, String nome, long cpf,String endereco,String telefone,String senha,int tipo ){
        
        this.Id = id;
        this.nome = this.nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
        this.tipo = tipo;
   
    }
      

    public int getId() { return Id; }
    public void setId(int record) { this.Id = record;}
    public long getCpf() {   return cpf; }
    public void setCpf(long cpf) {  this.cpf = cpf; }
    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome = nome; }
    public String getEndereco() {return endereco; }
    public void setEndereco(String endereco) {  this.endereco = endereco; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public int getTipo() {return tipo;}
    public void setTipo(int tipo) { this.tipo = tipo;}
    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = this.senha;}
    
    
    
    
}
