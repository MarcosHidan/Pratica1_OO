package br.newtonpaiva.com;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do aluno
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();

        System.out.print("Nota da AV1: ");
        double notaAV1 = scanner.nextDouble();

        System.out.print("Nota da AV2: ");
        double notaAV2 = scanner.nextDouble();

        System.out.print("Curso: ");
        String curso = scanner.next();

        System.out.print("Período: ");
        String periodo = scanner.next();

        // Criar objeto Aluno com os dados fornecidos
        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        // Avaliar o aluno com base nas notas de AV1 e AV2
        aluno.avaliarAluno();

        // Solicitar nota de AE, se necessário
        if (aluno.notaAV1 + aluno.notaAV2 < 60.0) {
            System.out.print("Nota de AE: ");
            double notaAE = scanner.nextDouble();
            aluno.alteraNotaAE(notaAE);
            aluno.avaliarRecuperacao();
        }

        scanner.close();
    }
}