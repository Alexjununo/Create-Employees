package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        ArrayList<Funcionarios> funcsMasculino = new ArrayList<>();
        ArrayList<Funcionarios> funcsFeminino = new ArrayList<>();

        String controle;

        float folhaDeGasto = 0;
        float mediaSalMasc = 0;
        float mediaSalFem = 0;

        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Voce deseja cadastrar um funcionario? (S/N) ");
            controle = read.next();

            if (controle.equals("N")) {
                break;
            }

            System.out.println("Informe o nome: ");
            String nome = read.next();

            System.out.println("Informe o sexo: ");
            String sexo = read.next();

            System.out.println("Informe o salario: ");
            float salario = read.nextFloat();

            funcionarios.add(new Funcionarios(nome, sexo, salario));

        } while (funcionarios.size() != 10);

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionarios func = funcionarios.get(i);

            if (func.getSexo().equals("masculino")) {
                funcsMasculino.add(func);
                mediaSalMasc += func.getSalario();
            } else if (func.getSexo().equals("feminino")) {
                funcsFeminino.add(func);
                mediaSalFem += func.getSalario();
            }

            folhaDeGasto += func.getSalario();
        }

        System.out.println("Relacao dos funcionarios masculino:");
        for (int j = 0; j < funcsMasculino.size(); j++) {
            funcsMasculino.get(j).getDados();
        }

        System.out.println("Relacao dos funcionarios feminino:");
        for (int j = 0; j < funcsFeminino.size(); j++) {
            funcsFeminino.get(j).getDados();
        }

        System.out.println("O total gasto com a folha de pagamento: R$" + folhaDeGasto);

        System.out.println("O salario medio dos funcionarios do sexo masculino: R$" + mediaSalMasc / funcsMasculino.size());

        System.out.println("O salario medio dos funcionarios do sexo feminino: R$" + mediaSalFem / funcsFeminino.size());
    }
}
