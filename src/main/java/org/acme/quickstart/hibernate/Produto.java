package org.acme.quickstart.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.eclipse.microprofile.opentracing.Traced;

/**
 * Produto
 */
@Entity(name = "produto")
@Traced
public class Produto {

    @Id
    private long id;

    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}