package pirate;

import cartes.Pioche;
import vue.Affichage;
import vue.IAffichage;
import cartes.Carte;
import cartes.CarteAttaque;
import cartes.CartePopularité;
import cartes.CarteDeffense;
import cartes.CarteDiffamation;
import cartes.CarteDoubleTour;
import cartes.CarteChance;
import cartes.CarteSoin;
import vue.ZoneJeu;

public class Jeu {
    private static IAffichage affichage = new Affichage();
    private Pioche pioche = new Pioche();
    private Pirate joueur1;
    private Pirate joueur2;

    public static IAffichage getAffichage() {
        return affichage;
    }

    public void lancerJeu() {
        affichage.afficherBienvenue();
        affichage.raconterHistoire();
        affichage.presentJeu();

        // Initialisation des joueurs
        String nom1 = affichage.demanderNom(1);
        String nom2 = affichage.demanderNom(2);
        joueur1 = new Pirate(nom1);
        joueur2 = new Pirate(nom2);
        
        // Initialisation des mains
        joueur1.setMain(new LaMain(pioche));
        joueur2.setMain(new LaMain(pioche));
      
        /*testtttttttt
        
        Carte[] cartes =joueur1.getMain().getMainCarte();
        for(int i=0;i < 4 ;i++) {
        	affichage.afficherMessage(cartes[i].getNom());
        }
        */
        // Boucle de jeu
        Pirate joueurActuel = joueur1;
        Pirate adversaire = joueur2;

        while (!partieTerminee()) {
            affichage.afficherEtat(joueurActuel.getNom(),joueurActuel.getnbrCoeur(),joueurActuel.getPopularite());
            affichage.afficherEtat(adversaire.getNom(),adversaire.getnbrCoeur(),adversaire.getPopularite());

            boolean rejouer = tourJoueur(joueurActuel, adversaire);
            
            // Si le joueur n a pas une Carte Double Tour, on change de joueur
            if (!rejouer) {
                Pirate temp = joueurActuel;
                joueurActuel = adversaire;
                adversaire = temp;
            }
        }

        // Annonce du gagnant
        determinerGagnant();
    }

    private boolean tourJoueur(Pirate joueur, Pirate adversaire) {
        affichage.afficherMessage("C'est au tour de " + joueur.getNom());

        // Piocher une carte
        if (!pioche.estVide()) {
        	
            Carte cartePiochee = pioche.retirerCarte();
            joueur.getMain().ajouterCarte(cartePiochee);
            affichage.afficherMessage(joueur.getNom() + " a pioché une carte son nom est: "+cartePiochee.getNom()+" et sa description : "+cartePiochee.getDescription());
        }
        affichage.afficherMain(joueur.getNom(), joueur.getMain().getMainCarte());
        String str=affichage.demanderNumeroCarte();
        int NumCarte=Integer.parseInt(str);
        
        // Jouer une carte
        Carte carteJouee = joueur.getMain().retirerDeMain(NumCarte); // Simuler le choix de la première carte
        affichage.afficherMessage(joueur.getNom() + " a choisi une carte son nom est: "+carteJouee.getNom()+" et sa description : "+carteJouee.getDescription());
        if (carteJouee != null) {
            if (carteJouee instanceof CartePopularité) {
                carteJouee.appliquerCarte(joueur);
                carteJouee.afficher();
                ZoneJeu zone= carteJouee.donnerZone();
                affichage.afficherMessage("Et donc il a deposer la carte dans la zone "+zone.toString());
            } else if (carteJouee instanceof CarteAttaque) {
            	ZoneJeu zone= carteJouee.donnerZone();
            	affichage.afficherMessage("Et donc il a deposer la carte dans la zone "+zone.toString());
            	if (adversaire.geteviterAttaque()) {
            		affichage.afficherMessage(adversaire.getNom()+" a dodgé l'attaque grace a sa carte de Parade");
            	}
            	else{
            	carteJouee.appliquerCarte(adversaire);
                carteJouee.afficher();
            	}
            } else if (carteJouee instanceof CarteDoubleTour) {
            	carteJouee.appliquerCarte(joueur);
                carteJouee.afficher();
                ZoneJeu zone= carteJouee.donnerZone();
                affichage.afficherMessage("Et donc il a deposer la carte dans la zone "+zone.toString());
                return true; // Le joueur rejoue immédiatement
            } else if (carteJouee instanceof CarteDeffense || carteJouee instanceof CarteDiffamation || carteJouee instanceof CarteChance || carteJouee instanceof CarteSoin) {
            	carteJouee.appliquerCarte(joueur);
                carteJouee.afficher();
                ZoneJeu zone= carteJouee.donnerZone();
                affichage.afficherMessage("Et donc il a deposer la carte dans la zone "+zone.toString());
            }
        }

        return false; // Indique que le tour est terminé
    }

    private boolean partieTerminee() {
        return joueur1.getnbrCoeur() <= 0 || joueur2.getnbrCoeur() <= 0 || joueur1.getPopularite() >= 5 || joueur2.getPopularite() >= 5;
    }

    private void determinerGagnant() {
        if (joueur1.getnbrCoeur() <= 0) {
            affichage.afficherMessage(joueur2.getNom() + " a gagné ! "+joueur1.getNom()+" a perdu tout ses coeurs.");
        } else if (joueur2.getnbrCoeur() <= 0) {
            affichage.afficherMessage(joueur1.getNom() + " a gagné ! "+joueur2.getNom()+" a perdu tout ses coeurs.");
        } else if (joueur1.getPopularite() >= 5) {
            affichage.afficherMessage(joueur1.getNom() + " a gagné grâce à sa popularité !");
        } else {
            affichage.afficherMessage(joueur2.getNom() + " a gagné grâce à sa popularité !");
        }
    }
}
