package cartes;

import pirate.Pirate;
import vue.ZoneJeu;

public class CarteDoubleTour extends Carte {
    public CarteDoubleTour() {
        super("Coup rapide", "Permet de jouer une carte supplémentaire immédiatement.");
    }

    

	@Override
	public void afficher() {
		affichage.afficherCarte(nom,description);		
	}
	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.POPULARITE;
	}



	@Override
	public void appliquerCarte(Pirate joueur) {
		joueur.JouerDeuxFois(true); // Active un bonus pour un tour supplémentaire
        System.out.println(joueur.getNom() + " peut jouer une carte supplémentaire !");
	}
}

//Cette carte permet au joueur de rejouer une deuxieme fois