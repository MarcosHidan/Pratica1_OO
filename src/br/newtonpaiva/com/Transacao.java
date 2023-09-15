package br.newtonpaiva.com;

public class Transacao {
    private Carro carro;
    private Cliente cliente;
    private double valor;

    // Construtor
    public Transacao(Carro carro, Cliente cliente, double valor) {
        this.carro = carro;
        this.cliente = cliente;
        this.valor = valor;
    }

    // Getters e setters
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
