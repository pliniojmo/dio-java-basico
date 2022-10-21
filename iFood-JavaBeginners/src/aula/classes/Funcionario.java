package classes;

import javax.xml.crypto.Data;

public class Funcionario {
    private String nome;
    private String endereco;
    private int identidade;
    private String cpf;
    
    public Funcionario () {}

    public Funcionario (String nome, String endereco, int identidade, String cpf) {
        this.nome=nome;
        this.endereco=endereco;
        this.identidade = identidade;
        this.cpf = cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdentidade() {
        return identidade;
    }

    public String getCpf() {
        return cpf;
    }
}
