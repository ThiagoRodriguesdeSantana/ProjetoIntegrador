
package controller;

public class Teacher extends People{
    
    private String title;
    private String discipline;

    public Teacher(int id, String nome, long cpf, String address,String fone, String password, int type) {
        super(id, nome, cpf, address,fone, password, type);
    }


    public String getTitle() { return title;}
    public void setTitle(String title) { this.title = title;}
    public String getDiscipline() {return discipline;}
    public void setDiscipline(String discipline) {this.discipline = discipline;}
    
}
