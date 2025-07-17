package Atividade01;

public class Aluno {
    private String ra;
    private String curso;
    private String nome;

    public Aluno(String ra, String curso,String nome){
        this.ra = ra;
        this.curso = curso;
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return String.format("RA: %s | Curso: %s | Nome: %s", ra, curso, nome);
    }
}
