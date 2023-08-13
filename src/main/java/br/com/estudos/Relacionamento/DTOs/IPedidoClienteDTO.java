package br.com.estudos.Relacionamento.DTOs;

public interface IPedidoClienteDTO {
    int getId();
    double getValor_total();
    int getCliente_id();
    String getNome();
    String getTelefone();  
    int getProduto_id();
    String getNome_produto();
    String getDescricao_produto();
    double getValor_produto();
}
