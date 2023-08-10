package br.com.estudos.Relacionamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos.Relacionamento.DAOs.IClientesRepository;
import br.com.estudos.Relacionamento.models.Cliente;


@CrossOrigin("*")
@RestController
public class ClientesController {

    @Autowired
    private IClientesRepository repo;

    @GetMapping("/clientes")
    public Iterable<Cliente> index(){
        return repo.findAll();
    }    

    @PostMapping("/clientes")
    public ResponseEntity<Object> create(@RequestBody Cliente cliente){ 
        repo.save(cliente);
        return ResponseEntity.status(201).body(cliente);
    } 

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Object> show(@PathVariable int id){
        if(!repo.existsById(id)) return ResponseEntity.status(404).build();        
    
        var clienteDb = repo.findById(id).get();

        return ResponseEntity.status(200).body(clienteDb);
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<Object> update(@PathVariable int id, @RequestBody Cliente cliente){
        if(!repo.existsById(id)) return ResponseEntity.status(404).build();        
    
        var clienteDb = repo.findById(id).get();
        clienteDb.setNome(cliente.getNome());
        repo.save(clienteDb);

        return ResponseEntity.status(200).body(clienteDb);
    }   

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Cliente> delete(@PathVariable int id){                   

        if(!repo.existsById(id)) return ResponseEntity.status(404).build();

        repo.deleteById(id);
        return ResponseEntity.status(204).build();
    }    
}




