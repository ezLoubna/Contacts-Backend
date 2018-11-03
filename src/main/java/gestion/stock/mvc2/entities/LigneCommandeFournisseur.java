package gestion.stock.mvc2.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class LigneCommandeFournisseur implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String IdLigneCdeFr;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFour")
	private CommandeFournisseur commandeFournisseur;
	
	


	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	

	

	public LigneCommandeFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdLigneCdeFr() {
		return IdLigneCdeFr;
	}

	public void setIdLigneCdeFr(String idLigneCdeFr) {
		IdLigneCdeFr = idLigneCdeFr;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

}
