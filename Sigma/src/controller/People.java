
package controller;

public abstract class People {
    
    protected int Id;
    protected long cpf;
    protected String name;
    protected String address;
    protected String fone;
    protected int type;
    protected String password;
    
    public People(){
        
    }
    
    public People(int id, String nome, long cpf,String address,String fone, String password,int type ){
        
        this.Id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.fone = fone;
        this.password = password;
        this.type = type;
   
    }
      

    public int getId() { return Id; }
    public void setId(int record) { this.Id = record;}
    public long getCpf() {   return cpf; }
    public void setCpf(long cpf) {  this.cpf = cpf; }
    public String getName() { return name;}
    public void setName(String name) { this.name = name; }
    public String getAddress() {return address; }
    public void setAddress(String address) {  this.address = address; }
    public String getFone() { return fone; }
    public void setFone(String fone) { this.fone = fone; }
    public int getType() {return type;}
    public void setType(int type) { this.type = type;}
    public String getPassword() {return password;}
    public void setPassword(String senha) {this.password = password;}
    
    
    
    
}
