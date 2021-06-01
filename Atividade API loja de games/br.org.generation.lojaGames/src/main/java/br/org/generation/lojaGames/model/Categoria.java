package br.org.generation.lojaGames.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 5, max = 100, message = "O campo deve conter no mínimo 5 e no máximo 100 caracteres")
	private String titulo;

	@NotNull
	@Size(min = 5, max = 255, message = "O campo deve conter no mínimo 5 e no máximo 255 caracteres")
	private String consoles;

	@NotNull
	@Size(min = 5, max = 255, message = "O campo deve conter no mínimo 5 e no máximo 255 caracteres")
	private String games;

	@NotNull
	@Size(min = 5, max = 255, message = "O campo deve conter no mínimo 5 e no máximo 255 caracteres")
	private String acessorios;

	@Size(min = 5, max = 500, message = "O campo deve conter no mínimo 5 e no máximo 500 caracteres")
	private String descricao;

	@NotNull
	private double preco;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConsoles() {
		return consoles;
	}

	public void setConsoles(String consoles) {
		this.consoles = consoles;
	}

	public String getGames() {
		return games;
	}

	public void setGames(String games) {
		this.games = games;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto getTema() {
		return produto;
	}

	public void setTema(Produto produto) {
		this.produto = produto;
	}
}

