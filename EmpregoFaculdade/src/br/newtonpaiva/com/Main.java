package br.newtonpaiva.com;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto EmpregadoDaFaculdade
        EmpregoFaculdade professor = new EmpregoFaculdade("João", 2500.0, 10);

        // Exibir os resultados dos métodos getGastos() e getInfo()
        System.out.println("Gastos totais: R$" + professor.getGastos());
        System.out.println(professor.getInfo());
    }
}