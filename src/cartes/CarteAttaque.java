package cartes;
import pirate.Pirate;
import vue.ZoneJeu;

public class CarteAttaque extends Carte {
	public CarteAttaque(String nom, int force ,String description) {
		super(nom,force ,description);
	}
	@Override
	public void appliquerCarte(Pirate joueur) {
		joueur.setnbrCoeur(getPuissance());
	}
	@Override
	public ZoneJeu donnerZone() {
		return ZoneJeu.ATTAQUE;
	}
}