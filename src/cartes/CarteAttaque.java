package cartes;
import pirate.Pirate;
import vue.ZoneJeu;

public class CarteAttaque extends Carte {
	public int force;
	public CarteAttaque(String nom, int force ,String description) {
		super(nom,description);
		this.force=force;
	}
	@Override
	public void appliquerCarte(Pirate joueur) {
		joueur.setnbrCoeur(force);
	}
	public void afficher() {
		affichage.afficherCarte(nom,description);
	}
	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.ATTAQUE;
	}
}