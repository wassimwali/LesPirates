package cartes;

import pirate.Jeu;
import pirate.Pirate;
import vue.IAffichage;
import vue.ZoneJeu;

public abstract class Carte {
	protected String nom;
	protected String description;
	protected static final IAffichage affichage = Jeu.getAffichage();

	public Carte(String nom, String description) {
		this.nom = nom;
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public abstract void afficher();

	public abstract void appliquerCarte(Pirate joueur);

	public abstract ZoneJeu donnerZone();
}
