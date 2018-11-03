package gestion.stock.mvc2.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MvtStk implements Serializable {

	/**
	 * 
	 */
	public static final int ENTREE = 1;
	public static final int SORTEE = 2;
	
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long idMvtStk;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantite;
	
	private int typeMvt;
	
	@ManyToOne
	@JoinColumn(name="idAticle")
	private Article article;
	
	
	
	
	public Date getDateMvt() {
		return dateMvt;
	}
	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}
	public int getTypeMvt() {
		return typeMvt;
	}
	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public static int getEntree() {
		return ENTREE;
	}
	public static int getSortee() {
		return SORTEE;
	}
	public Long getIdMvtStk() {
		return idMvtStk;
	}
	public void setIdMvtStk(Long idMvtStk) {
		this.idMvtStk = idMvtStk;
	}

}
