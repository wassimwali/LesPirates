package cartes;

import pirate.Pirate;
import vue.ZoneJeu;

public class CartePopularité extends Carte {
	public int puissance;
	public CartePopularité(String nom, int val ,String description) {
		super(nom,description);
		this.puissance=val;
	}
	@Override
	public void afficher() {
		affichage.afficherCarte(nom,description);
	}
	@Override
	public void appliquerCarte(Pirate joueur) {
		joueur.setPopularite(puissance);
	}
	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.POPULARITE;
	}
	
}
