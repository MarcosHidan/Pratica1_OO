package br.newtonpaiva.com;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Cliente
        Cliente cliente1 = new Cliente("João da Silva", "Rua ABC, 123", "(11) 98765-4321");

        // Criar um objeto Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 45000.0);

        // Criar uma Transação
        Transacao transacao1 = new Transacao(carro1, cliente1, 40000.0);

        // Exibir informações sobre a transação
        System.out.println("Detalhes da transação:");
        System.out.println("Cliente: " + transacao1.getCliente().getNome());
        System.out.println("Carro: " + transacao1.getCarro().getMarca() + " " + transacao1.getCarro().getModelo());
        System.out.println("Valor da transação: R$" + transacao1.getValor());

        // Marcar o carro como vendido
        carro1.setVendido(true);

        // Exibir o status do carro
        System.out.println("O carro foi vendido? " + (carro1.isVendido() ? "Sim" : "Não"));
    }
}
