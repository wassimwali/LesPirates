package pirate;

import cartes.Carte;

public class LaMain {
	private static final int nbrMAX=5;
	private Carte[] cartes=new Carte[nbrMAX];
	
	public LaMain(Carte[] cartes) {
		this.cartes=cartes;
	}
	public void afficher() {
		for (int i = 0; i < nbrMAX && cartes[i] != null; i++) {
			cartes[i].afficher(i + 1);
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

	
}
