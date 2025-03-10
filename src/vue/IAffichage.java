package vue;

public interface IAffichage {

	void afficherBienvenue();

	void raconterHistoire();

	String demanderNom(int NumJoueur);

	void afficherPopularit(String nomPirate, int popularite);

	void afficherCarte(String nom,String description, int puissance);
	public void presentJeu();

	void afficherNbrCoeur(String Nom, int nbr);

}