
package controller;

public class Student extends People{
    
    private long registrartion;
    private String course;
    private String situacao;

    
    
    public Student(int id, String nome, long cpf, String address,String fone, String password, int type) {
        super(id, nome, cpf, fone, address, password, type);
    }
    

    public long getRegistrartion() {return registrartion;}
    public void setRegistrartion(long registrartion) { this.registrartion = registrartion;}
    public String getCourse() { return course;}
    public void setCourse(String course) { this.course = course;}
    public void setSituacao(String situacao) { this.situacao = situacao; }

    
}
