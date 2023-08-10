package br.com.estudos.Relacionamento.DAOs;

import org.springframework.data.repository.CrudRepository;

import br.com.estudos.Relacionamento.models.Produto;

public interface IProdutosRepository extends CrudRepository<Produto, Integer>{
    
}
