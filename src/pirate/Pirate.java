package pirate;

import cartes.Carte;

public class Pirate {
	private String nom;
	private int nbrCoeur;
	private Carte[] main;
	private int taille=0;
	private int popularite;
	public Pirate(String nom) {
		this.nom=nom;
		this.nbrCoeur=5;
		this.main=new Carte[5];
		this.popularite=0;
	}
	public String getNom() {
		return nom;
	}
	public int getnbrCoeur() {
		return nbrCoeur;
	}
	public Carte inventerCarte(String nom, int force , String type) {
		Carte carte=new Carte(nom,force,type);
		return carte;
	}
	public void piochceCarte(Carte carte) {
		taille++;
		main[taille]=carte;
	}
	public void attaquer(Carte carte,Pirate adversaire) {
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
}
