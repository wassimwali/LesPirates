package vue;

import cartes.Carte;

public interface IAffichage {

	void afficherBienvenue();

	void raconterHistoire();

	String demanderNom(int NumJoueur);

	void afficherPopularit(String nomPirate, int popularite);

	void afficherCarte(String nom,String description);
	public void presentJeu();

	void afficherNbrCoeur(String Nom, int nbr);

}