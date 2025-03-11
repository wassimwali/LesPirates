package pirate;

import cartes.Carte;
import cartes.Pioche;
import vue.IAffichage;

public class LaMain {
	private static final int nbrMAX=5;
	private Carte[] cartes=new Carte[nbrMAX];
	private static final IAffichage affichage = Jeu.getAffichage();
	
	public LaMain() {}
	public void afficher() {
		for (int i = 0; i < nbrMAX && cartes[i] != null; i++) {
			affichage.afficherCarte(cartes[i].getNom(), cartes[i].getDescription());
		}
	}
	public boolean ajouterCarte(Carte carte) {
	    int dernierIndice =nbrMAX - 1;
	    if (cartes[dernierIndice]== null) {
	        cartes[dernierIndice] = carte;
	        return true;
	    }
	    return false;
	}
	public Carte retirerDeMain(int numCarte) {
	    Carte carteRetiree = cartes[numCarte - 1];
	    for (int i = numCarte; i < nbrMAX; i++) {
	        cartes[numCarte - 1] = cartes[numCarte];
	    }
	    cartes[nbrMAX - 1] = null;
	    return carteRetiree;
	}
	public void initialiserMain(Pioche pioche) {
        for (int i = 0; i < 4; i++) {
            if (!pioche.estVide()) {
                ajouterCarte(pioche.retirerCarte());
            }
        }
    }

	
}
