package com.company.veterinario.models;

public class DogModel {
    Long cadastroDog;
    String nome;
    String raca;
    int idade;

    public Long getCadastroDog() {
        return cadastroDog;
    }

    public void setCadastroDog(Long cadastroDog) {
        this.cadastroDog = cadastroDog;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
