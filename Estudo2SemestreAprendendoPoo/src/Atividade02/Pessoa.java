package Atividade02;

public class Pessoa {
     private String rg;
     private String email;
     private String nome;
     private String endereco;
     private String cpf;
     private String celular;
     private double altura;
     private double peso;
     private char sexo;
     private int idade;


    public Pessoa(String rg, String email, String nome, String endereco, String cpf, String celular, double altura, double peso, char sexo, int idade) {
        this.rg = rg;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.celular = celular;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "rg='" + rg + '\'' +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", celular='" + celular + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }
}
