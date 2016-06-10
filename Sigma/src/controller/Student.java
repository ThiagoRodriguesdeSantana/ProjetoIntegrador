
package controller;

public class Student extends People{
    
    private long registrartion;
    private String course;
    private String login;
    private long senha;
    private String situacao;

    /**
     * @return the registrartion
     */
    public long getRegistrartion() {
        return registrartion;
    }

    /**
     * @param registrartion the registrartion to set
     */
    public void setRegistrartion(long registrartion) {
        this.registrartion = registrartion;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public long getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(long senha) {
        this.senha = senha;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
    
}
