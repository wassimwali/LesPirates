package cartes;

import pirate.Pirate;
import vue.ZoneJeu;

public class CarteSoin extends Carte {
	private final int soin;
	
	public CarteSoin(int soin) {
		super("Élixir de vitalité", "Récupère " + soin + " points de vie.");
		this.soin=soin;
	}

	@Override
	public void afficher() {
		affichage.afficherCarte(nom,description);
		
	}

	@Override
	public void appliquerCarte(Pirate joueur) {
		int a =joueur.getnbrCoeur()+soin;
		joueur.setnbrCoeur(a);
        System.out.println(joueur.getNom() + " récupère " + soin + " points de vie !");
	}

	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.SPECIAL;
	}

}
//cette carte permet au joueur de recurpere un certain nbr de coeurs