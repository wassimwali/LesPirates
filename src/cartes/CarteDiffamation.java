package cartes;

import pirate.Pirate;
import vue.ZoneJeu;

public class CarteDiffamation extends Carte{
	private int reduction;
	
	public CarteDiffamation(int reduction) {
		super("Calomnie Publique", "Une rumeur destructrice circule et ternit la réputation de l'adversaire.");
		this.reduction=reduction;
	}

	@Override
	public void afficher() {
		affichage.afficherCarte(nom,description);
		
	}

	@Override
	public void appliquerCarte(Pirate joueur) {
		joueur.reduirePopularite(reduction);
        System.out.println(joueur.getNom() + " perd " + reduction + " points de popularité !");
	}

	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.SPECIAL;
	}

}
