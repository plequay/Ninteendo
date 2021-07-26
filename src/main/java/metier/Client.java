package metier;

import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private List<Achat> achat;
	
	
	public Client(String nom, String prenom, List<Achat> achat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.achat = achat;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public List<Achat> getAchat() {
		return this.achat;
	}
	
	public void setAchat(List<Achat> achat) {
		this.achat = achat;
	}
	
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", achat=" + achat + "]";
	}
	
	
	
	
	
}
