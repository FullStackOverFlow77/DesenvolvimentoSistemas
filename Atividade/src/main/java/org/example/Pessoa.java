package org.example;

public class Pessoa {
    private String pessoa;


    public Pessoa(){

    }

    public Pessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Nome: " + pessoa ;
    }
}
