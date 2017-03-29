package br.cnec.fcsl.entidade;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length=45)
	private String nome;

	@ManyToMany(mappedBy="autor")
	private Collection<Livro> livro;

	public Collection<Livro> getLivro() {
		return livro;
	}

	public void setLivro(Collection<Livro> livro) {
		this.livro = livro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
