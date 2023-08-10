package br.com.estudos.Relacionamento.DTOs;

public class PedidoDTO {
    private double valorTotal;  
    private int clienteId;

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public int getClienteId() {
        return clienteId;
    }
    public void setClienteIid(int clienteId) {
        this.clienteId = clienteId;
    }   
}
