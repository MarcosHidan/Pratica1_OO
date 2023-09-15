package br.newtonpaiva.com;

public class EmpregoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    // Construtor
    public EmpregoFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    // Método para calcular os gastos com o bônus
    double getGastos() {
        double bonus = horasAula * 40.0; // Bônus de R$ 40 por hora/aula
        return this.salario + bonus;
    }

    // Método para retornar informações atualizadas
    String getInfo() {
        double total = getGastos();
        return "Nome: " + this.nome + " com salário: R$" + total;
    }
}
