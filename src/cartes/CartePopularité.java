package cartes;

import pirate.Pirate;
import vue.ZoneJeu;

public class CartePopularité extends Carte {
	public CartePopularité(String nom, int force ,String description) {
		super(nom,force ,description);
	}
	@Override
	public void appliquerCarte(Pirate joueur) {
		joueur.setPopularite(getPuissance());
	}
	public ZoneJeu donnerZone() {
		return ZoneJeu.POPULARITE;
	}
	
}
