
package controller;

public class Student extends People{
    
    private long registrartion;
    private String course;
    private String situacao;

    public long getRegistrartion() {return registrartion;}
    public void setRegistrartion(long registrartion) { this.registrartion = registrartion;}
    public String getCourse() { return course;}
    public void setCourse(String course) { this.course = course;}
    public void setSituacao(String situacao) { this.situacao = situacao; }

    
}
