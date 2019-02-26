package br.com.cesarprojes.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="texto")
public class Texto {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	private String autor;
	
	private String conteudo;	
	
	@OneToMany(mappedBy = "texto", fetch = FetchType.EAGER)
	private List<Comentario> comentarios;

	public Texto() {
		super();
	}

	public Texto(long id, String autor, String conteudo, List<Comentario> comentarios) {
		super();
		this.id = id;
		this.autor = autor;
		this.conteudo = conteudo;
		this.comentarios = comentarios;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
}
