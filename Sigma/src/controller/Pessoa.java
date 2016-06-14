
package controller;

public abstract class Pessoa {
    
    protected int Id;
    protected String cpf;
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected int tipo;
    protected String senha;
    
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String cpf,String endereco,String telefone,String senha,int tipo ){
        
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
        this.tipo = tipo;
   
    }
    
    public Pessoa(int id, String nome, String cpf,String endereco,String telefone,String senha,int tipo ){
        
        this.Id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
        this.tipo = tipo;
   
    }
      

    public int getId() { return Id; }
    public void setId(int record) { this.Id = record;}
    public String getCpf() {   return cpf; }
    public void setCpf(String cpf) {  this.cpf = cpf; }
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
