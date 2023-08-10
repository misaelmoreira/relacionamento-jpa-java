package br.com.estudos.Relacionamento.DAOs;

import org.springframework.data.repository.CrudRepository;

import br.com.estudos.Relacionamento.models.PedidoProduto;

public interface IPedidosProdutosRepository extends CrudRepository<PedidoProduto, Integer>{
    
}
