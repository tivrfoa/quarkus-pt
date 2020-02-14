package org.acme.quickstart.panache;

import org.acme.quickstart.panache.Pessoa.Tipo;

public class IncluirPessoaDTO {

    private String nome;
    private Tipo tipo;

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
