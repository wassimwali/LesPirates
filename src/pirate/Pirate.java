package pirate;

import cartes.CarteAttaque;
import cartes.CartePopularité;

public class Pirate {
	private String nom;
	private int nbrCoeur;
	private LaMain main;
	private int popularite=0;
	private boolean Deuxfois;
	private boolean eviterAttaque;
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
		if (this.nbrCoeur < 0) {
	        this.nbrCoeur = 0;
	    }
	}
	public int getPopularite() {
		return popularite;
	}
	public void setPopularite(int val) {
		this.popularite+=val;
		if (this.popularite>5) {
	        this.popularite = 5;
	    }
	}
	public void attaquer(CarteAttaque carte,Pirate adversaire) {
		carte.appliquerCarte(adversaire);
	}
	public void boosterPopularité(CartePopularité carte) {
		carte.appliquerCarte(this);
	}
	public void JouerDeuxFois(boolean b) {
		this.Deuxfois = b;
		
	}
	public void eviterAttaque(boolean b) {
		this.eviterAttaque = b;
		
	}
	public void reduirePopularite(int reduction) {
		popularite-=reduction;
		
	}
}
