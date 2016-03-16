import java.util.Random;

public class EssaiPlateau {
	public static void main(String[] args) {
		Random r = new Random();
		String[] gifs = { "images/1.explorateur.png", "images/2.explorateur.png", "images/1.navire.png",
				"images/1.piegeur.png", "images/2.navire.png", "images/2.piegeur.png", "images/arbre.png",
				"images/coffre.png.jpg", "images/rocher.png.jpg" };
		int taille = 10;

		Plateau p = new Plateau(gifs, taille);
		int[][] jeu = new int[taille][taille];
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++)
				jeu[i][j] = r.nextInt(gifs.length + 1);
		p.setJeu(jeu);
		p.affichage();
	}
}
