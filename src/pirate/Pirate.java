package pirate;

import cartes.CarteAttaque;
import cartes.CartePopularité;

public class Pirate {
	private String nom;
	private int nbrCoeur;
	private LaMain main;
	private int popularite=0;
	public Pirate(String nom) {
		this.nom=nom;
		this.nbrCoeur=5;
		this.popularite=0;
	}
	public String getNom() {
		return nom;
	}
	public void setMain(LaMain main) {
		this.main=main;
	}
	public LaMain getMain() {
		return main;
	}
	public int getnbrCoeur() {
		return nbrCoeur;
	}
	public void setnbrCoeur(int val) {
		this.nbrCoeur-=val;
	}
	public int getPopularite() {
		return popularite;
	}
	public void setPopularite(int val) {
		this.popularite+=val;
	}
	
	public void attaquer(CarteAttaque carte,Pirate adversaire) {
		carte.appliquerCarte(adversaire);
	}
	public void boosterPopularité(CartePopularité carte) {
		carte.appliquerCarte();
	}
*/
}
