package org.acme.quickstart.panache;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * Pessoa
 */
@Entity
public class Pessoa extends PanacheEntity {

    private String nome;
    private Tipo tipo;

    enum Tipo {
        SURINAME, PF, PJ;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

    
}