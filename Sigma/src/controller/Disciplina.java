package controller;

public class Disciplina {
    
    private int id;
    private String desc;
    private String ementa;
    private String bibliografia;
    private String preRequisito;
    private int periodo;
    private int professor;

    public Disciplina(){
        
    }
    
    public Disciplina(int id, String desc, String ementa, String bibliografia, String preRequisito, int perido, int professor) {
        this.id = id;
        this.desc = desc;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
        this.preRequisito = preRequisito;
        this.periodo = perido;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public String getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(String preRequisito) {
        this.preRequisito = preRequisito;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int perido) {
        this.periodo = perido;
    }

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }
            
    
}
