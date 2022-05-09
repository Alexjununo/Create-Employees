package com.company;

public class Funcionarios {
    private String nome;
    private String sexo;
    private float salario;

    public Funcionarios(String nome, String sexo, float salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void getDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println(("Salario: R$" + this.salario));
    }
}
