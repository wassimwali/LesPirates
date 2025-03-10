package pirate;

import cartes.Carte;
import cartes.Pioche;
import vue.Affichage;
import vue.IAffichage;

public class Jeu {
	private static final int NBJOUEUR = 2;
	private static IAffichage affichage = new Affichage();
	private Pioche pioche = new Pioche();
	
	public static IAffichage getAffichage() {
		return affichage;
	}
	public void lancerJeu() {
		affichage.afficherBienvenue();
		affichage.raconterHistoire();
		affichage.presentJeu();
		String Nom1=affichage.demanderNom(1);
		String Nom2=affichage.demanderNom(2);
		Pirate Joueur1=new Pirate(Nom1);
		Pirate Joueur2=new Pirate(Nom2);	
	}
	/*public Carte inventerCarte(String nom, int force , String description) {
		Carte carte=new Carte(nom,force,description);
		return carte;
	}
*/
}
