package cartes;

import pirate.Jeu;
import pirate.Pirate;
import vue.IAffichage;
import vue.ZoneJeu;

public abstract class Carte {
	protected String nom;
	protected int puissance;
	protected String description;
	protected static final IAffichage affichage = Jeu.getAffichage();
	public Carte(String nom, int force ,String description) {
		this.nom=nom;
		this.puissance=force;
		this.description=description;
	}
	public String getNom() {
		return nom;
	}
	public int getPuissance() {
		return puissance;
	}
	public String getDescription() {
		return description;
	}
	public void afficher(int numCarte) {
		affichage.afficherCarte(nom,description,puissance);
	}
	public abstract void appliquerCarte(Pirate joueur);
	public abstract ZoneJeu donnerZone();
}

