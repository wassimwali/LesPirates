package cartes;

import java.security.SecureRandom;

public class Pioche {
    private static final int TAILLEPIOCHE = 30;
    private  Carte[] cartes = new Carte[TAILLEPIOCHE];
    private static SecureRandom random = new SecureRandom();
    private int nbCartes = TAILLEPIOCHE;
    public Pioche() {
        initialiserPioche();
        melangerPioche();
    }

    private void initialiserPioche() {
        int index = 0;

        // Ajouter 8 cartes Attaque
        for (int i = 0; i < 8; i++) {
            cartes[index++] = new CarteAttaque("Coup de Sabre", 2, "Une attaque rapide infligeant des dégâts de 2 unité de vie.");
        }

        // Ajouter 6 cartes Défense
        for (int i = 0; i < 6; i++) {
            cartes[index++] = new CarteDeffense();
        }
        
        // Ajouter 4 cartes Diffamation
        for (int i = 0; i < 4; i++) {
            cartes[index++] = new CarteDiffamation(3);
        }

        // Ajouter 6 cartes Popularité
        for (int i = 0; i < 6; i++) {
            cartes[index++] = new CartePopularité("Réputation de Pirate", 2, "Gagne en notoriété 2 unité de popularité.");
        }

        // Ajouter 4 cartes Soin
        for (int i = 0; i < 4; i++) {
            cartes[index++] = new CarteSoin(3);
        }

        // Ajouter 2 cartes Chance
        for (int i = 0; i < 2; i++) {
            cartes[index++] = new CarteChance();
        }
    }
    //  Méthode pour mélanger la pioche
    private void melangerPioche() {
        for (int i = cartes.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
            Carte temp = cartes[i];
            cartes[i] = cartes[j];
            cartes[j] = temp;
        }
    }
    public Carte retirerCarte() {
        if (nbCartes == 0) {
            System.out.println("La pioche est vide !");
            return null;
        }
        Carte carteRetiree = cartes[0];
        // Décaler toutes les cartes vers la gauche
        for (int i = 0; i < nbCartes - 1; i++) {
            cartes[i] = cartes[i + 1];
        }
        cartes[nbCartes - 1] = null; // Supprime la dernière référence
        nbCartes--; // Décrémente le nombre de cartes restantes

        return carteRetiree;
    }
    public boolean estVide() {
        return cartes.length==0;
    }
    
}
