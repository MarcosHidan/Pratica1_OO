package br.newtonpaiva.com;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    double notaAV1;
    double notaAV2;
    private double notaAE;
    private String curso;
    private String periodo;

    // Construtor
    public Aluno(String nome, int matricula, double notaAV1, double notaAV2, String curso, String periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
        this.notaAE = 0.0; // Inicialmente, a nota de AE é zero.
    }

    // Métodos para alterar as notas
    public void alteraNotaAV1(double novaNotaAV1) {
        this.notaAV1 = novaNotaAV1;
    }

    public void alteraNotaAV2(double novaNotaAV2) {
        this.notaAV2 = novaNotaAV2;
    }

    public void alteraNotaAE(double novaNotaAE) {
        this.notaAE = novaNotaAE;
    }

    // Método para avaliar o aluno
    public void avaliarAluno() {
        double somaNotasAV = notaAV1 + notaAV2;
        if (somaNotasAV >= 60.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }
    }

    // Método para avaliar recuperação
    public void avaliarRecuperacao() {
        double media = (notaAV1 + notaAV2 + notaAE) / 3;
        if (media >= 60.0) {
            System.out.println("Situação: Aprovado na Recuperação");
        } else {
            System.out.println("Situação: Reprovado na Recuperação");
        }
    }
}
