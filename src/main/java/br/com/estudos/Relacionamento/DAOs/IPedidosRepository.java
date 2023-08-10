package br.com.estudos.Relacionamento.DAOs;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.estudos.Relacionamento.DTOs.PedidoClienteDTO;
import br.com.estudos.Relacionamento.models.Pedido;

public interface IPedidosRepository extends CrudRepository<Pedido, Integer>{

    @Query(value="select pedidos.*, clientes.nome, clientes.telefone from pedidos inner join clientes on clientes.id = pedidos.cliente_id", nativeQuery = true)
    public Iterable<PedidoClienteDTO> todosComCliente(); 
      
}
