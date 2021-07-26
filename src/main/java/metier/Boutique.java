package metier;

import java.util.List;

public class Boutique {

	protected String nom;
	protected String Adresse;
	protected List<String> Jeux;
	
	
	public Boutique(String nom, String adresse, List<String> jeux) {
		super();
		this.nom = nom;
		Adresse = adresse;
		Jeux = jeux;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAdresse() {
		return Adresse;
	}
	
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	public List<String> getJeux() {
		return Jeux;
	}
	
	public void setJeux(List<String> jeux) {
		Jeux = jeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + Adresse + ", Jeux=" + Jeux + "]";
	}
		
	
	
	
}
