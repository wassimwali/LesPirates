package cartes;

public class Carte {
	private String nom;
	private int puissance;
	private String type;
	public Carte(String nom, int force ,String type) {
		this.nom=nom;
		this.puissance=force;
		this.type=type;
	}
	public String getNom() {
		return nom;
	}
	public int getPuissance() {
		return puissance;
	}
	public String getType() {
		return type;
	}
}

