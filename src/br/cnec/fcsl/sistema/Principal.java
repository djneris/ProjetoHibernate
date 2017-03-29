package br.cnec.fcsl.sistema;


import org.hibernate.Session;

import br.cnec.fcsl.entidade.*;

import br.cnec.fcsl.util.HibernateUtil;

public class Principal {

	public static void main(String[] args) {
		Autor autor = new Autor();
		Endereco endereco = new Endereco();
		Editora editora = new Editora();
		Livro livro = new Livro();
		Municipio municipio = new Municipio();
		Logradouro logradouro = new Logradouro();
		
		
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.saveOrUpdate(autor);
		session.saveOrUpdate(editora);
		session.saveOrUpdate(endereco);
		session.saveOrUpdate(livro);
		session.saveOrUpdate(municipio);
		session.saveOrUpdate(logradouro);
		session.getTransaction().commit();
	
	}
}
