package cartes;

import pirate.Pirate;
import vue.ZoneJeu;

public class CarteDeffense extends Carte{

	public CarteDeffense() {
		super("Parade Absolue", "Annule complètement la prochaine attaque subie.");
	}

	@Override
	public void afficher() {
		affichage.afficherCarte(nom,description);
		
	}

	@Override
	public void appliquerCarte(Pirate joueur) {
		joueur.eviterAttaque(true);
        System.out.println(joueur.getNom() + " active une défense totale ! Il évitera la prochaine attaque.");
	}

	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.SPECIAL;
	}

}
