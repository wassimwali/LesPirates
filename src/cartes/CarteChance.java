package cartes;

import java.security.SecureRandom;

import pirate.Pirate;
import vue.ZoneJeu;

public class CarteChance extends Carte {
    private static final SecureRandom random = new SecureRandom();

    public CarteChance() {
        super("Jet de dés", "Ajoute entre 1 et 4 points de popularité au hasard.");
    }

	@Override
	public void afficher() {
		affichage.afficherCarte(nom,description);		
	}

	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.SPECIAL;
	}

	@Override
	public void appliquerCarte(Pirate joueur) {
		int bonus = random.nextInt(4) + 1; // Génère un nombre entre 1 et 4
        int a=joueur.getPopularite()+bonus;
        joueur.setPopularite(a);
        System.out.println(joueur.getNom() + " gagne " + bonus + " points de popularité !");		
	}
}
