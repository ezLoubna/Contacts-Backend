package gestion.stock.mvc2.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class LigneCommandeClient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long IdLigneCdeClt;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient commandeclient;
	
	public Long getIdLigneCdeClt() {
		return IdLigneCdeClt;
	}


	public void setIdLigneCdeClt(Long idLigneCdeClt) {
		IdLigneCdeClt = idLigneCdeClt;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public CommandeClient getCommandeclient() {
		return commandeclient;
	}


	public void setCommandeclient(CommandeClient commandeclient) {
		this.commandeclient = commandeclient;
	}


	
	
	
	

}
