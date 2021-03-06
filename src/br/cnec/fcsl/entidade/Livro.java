package br.cnec.fcsl.entidade;


import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=45)
	private String nome;
	
	private int edicao;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data_publicacao;
	
	@ManyToOne
	@JoinColumn(name="editora_id") 
	private Editora editora;
	
	@ManyToMany
	@JoinTable(name="livro_autor",
	joinColumns=@JoinColumn(name="livro_id"),
	inverseJoinColumns=@JoinColumn(name="autor_id")) 	
	private Collection<Autor> autor;
	
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
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public Calendar getData_publicacao() {
		return data_publicacao;
	}
	public void setData_publicacao(Calendar data_publicacao) {
		this.data_publicacao = data_publicacao;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public Collection<Autor> getAutor() {
		return autor;
	}
	public void setAutor(Collection<Autor> autor) {
		this.autor = autor;
	}
	
}
