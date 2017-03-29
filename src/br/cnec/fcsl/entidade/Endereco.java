package br.cnec.fcsl.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=45)
	private String logradouro;
	
	@Column(length=5)
	private String numero;
	
	@Column(length=10)
	private String complemento;
	
	@Column(length=45)
	private String bairro;
	
	@Column(length=8)
	private String cep;
	
	@ManyToOne
	@JoinColumn(name="tipo_logradouro_id")
	private Logradouro tipo_logradouro;
	
	@ManyToOne
	@JoinColumn(name="municipio_id")
	private Municipio municipio;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Logradouro getTipo_logradouro() {
		return tipo_logradouro;
	}
	public void setTipo_logradouro(Logradouro tipo_logradouro) {
		this.tipo_logradouro = tipo_logradouro;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
	
}
