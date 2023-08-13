package br.com.estudos.Relacionamento.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(length = 150)
    private String nome;

    @Column(length = 15)
    private String telefone;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    };  

    // @JsonIgnore
    // @OneToMany(mappedBy = "cliente")
    // public List<Pedido> pedidos;

    // public List<Pedido> getPedidos() {
    //     return pedidos;
    // }
}
