
package controller;

public abstract class People {
    
    private int record;
    private long cpf;
    private String name;
    private String address;
    private String addressComp;
    private long fone;
    private String login;
    private long senha;

    public int getRecord() { return record; }
    public void setRecord(int record) { this.record = record;}
    public long getCpf() {   return cpf; }
    public void setCpf(long cpf) {  this.cpf = cpf; }
    public String getName() { return name;}
    public void setName(String name) { this.name = name; }
    public String getAddress() {return address; }
    public void setAddress(String address) {  this.address = address; }
    public String getAddressComp() {return addressComp; }
    public void setAddressComp(String addressComp) {this.addressComp = addressComp;  }
    public long getFone() { return fone; }
    public void setFone(long fone) { this.fone = fone; }
    public String getLogin() {return login;}
    public void setLogin(String login) { this.login = login;}
    public long getSenha() {return senha;}
    public void setSenha(long senha) {this.senha = senha;}
    
    
    
    
}
