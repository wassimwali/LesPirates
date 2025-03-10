package pirate;

import cartes.Carte;

public class Pirate {
	private String nom;
	private int nbrCoeur;
	private LaMain main;
	private int taille=0;
	private int popularite=0;
	public Pirate(String nom) {
		this.nom=nom;
		this.nbrCoeur=5;
		this.popularite=0;
	}
	public String getNom() {
		return nom;
	}
	public int getnbrCoeur() {
		return nbrCoeur;
	}
	public void setMain(LaMain main) {
		this.main=main;
	}
	public LaMain getMain() {
		return main
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
	
	/*public void attaquer(Carte carte,Pirate adversaire) {
		if (carte.getType()=="attaque") {
			adversaire.nbrCoeur-=carte.getPuissance();
		}
		else {
			System.out.println("cette carte est une carte de popularité");
		}
	}
	public void boosterPopularité(Carte carte) {
		if (carte.getType()=="popularité") {
			this.popularite+=carte.getPuissance();
		}
	}
*/
}
