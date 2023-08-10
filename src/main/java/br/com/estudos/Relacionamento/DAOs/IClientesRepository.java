package br.com.estudos.Relacionamento.DAOs;

import org.springframework.data.repository.CrudRepository;

import br.com.estudos.Relacionamento.models.Cliente;

public interface IClientesRepository extends CrudRepository<Cliente, Integer>{
    
}
