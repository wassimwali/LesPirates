package vue;
import java.util.Scanner;

public class Affichage implements IAffichage {
	private Scanner scanner=new Scanner(System.in);
	 @Override
	public void afficherBienvenue() {
		 System.out.println( "=====================================\n" +
		            "         BIENVENUE AU JEU DES PIRATES\n" +
		            "=====================================\n");
	 }
	 @Override
	public void raconterHistoire() {
		 System.out.println("Jack le Borgne et Bill Jambe-de-Bois sont deux pirates souhaitant prendre le\n" +
		            "commandement du navire à l’étendard noir, « Le Sanguinaire ». L’équipage doit\n" +
		            "les départager par un vote. Chacun des deux rivaux doit ainsi gagner en popularité\n" +
		            "ou affaiblir son adversaire afin de devenir le nouveau capitaine.\n\n");
	 }
	 @Override
	 public void presentJeu() {
		 System.out.println("Règles du jeu :\n" +
		            "---------------\n" +
		            "▪ Le Jeu des Pirates est un jeu de société de cartes dans lequel deux joueurs\n" +
		            "  s’affrontent.\n" +
		            "▪ Chaque joueur pioche quatre cartes. À tour de rôle, un pirate pioche une nouvelle\n" +
		            "  carte et l’ajoute à sa main.\n" +
		            "  Il doit ensuite décider s’il attaque son adversaire ou s’il s’attribue des points de popularité.\n\n" +
		            "Vies et Objectif :\n" +
		            "------------------\n" +
		            "▪ Chaque pirate possède cinq cœurs rouges correspondant à ses points de vie.\n" +
		            "  S’il n’a plus de cœur, alors il a perdu et son adversaire gagne.\n" +
		            "▪ Le but du jeu est que son pirate atteigne cinq points de popularité ou simplement\n" +
		            "  survive plus longtemps que son adversaire !\n\n" +
		            "=====================================\n" +
		            "    Que le meilleur pirate gagne !\n" +
		            "=====================================");
	 }
	 @Override
	public String demanderNom(int NumJoueur) {
		 System.out.println(" Entrez le nom du joueur numero "+NumJoueur+" : ");
		 return scanner.nextLine();
	 }
	 @Override
	public void afficherPopularit(String nomPirate, int popularite) {
		 System.out.println("\n la popularité de "+nomPirate+" est : "+popularite);
	 }
	 @Override
	public void afficherNbrCoeur(String Nom, int nbr) {
		 System.out.println("\n le pirate "+Nom+" a "+nbr+" Coeurs");
	 }
	 @Override
	public void afficherCarte(String nom,String description) {
		 System.out.println("\n Nom de la carte : "+nom);
		 System.out.println("\n Description carte : "+description);
	 }
}
