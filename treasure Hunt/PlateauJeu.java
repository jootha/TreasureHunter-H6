
	public class PlateauJeu {
	    private Plateau p1;
	    
	    public PlateauJeu (String[] gifs, int taille) {
		p1 = new Plateau(gifs, taille);
	    }
	    public boolean deplacer (int x, int y, int a, int b) {
		int [][] jeu = getJeu();
		int taille = jeu.length;
		if(x<0 || x>=taille || y<0 || y>=taille || a<0 || a>=taille || b<0 || b>=taille) {
		    return false;
		}
		if(jeu[x][y] == 0 || jeu[a][b] != 0) {
		    return false;
		}
		int img = jeu[x][y];
		jeu[a][b] = img;
		jeu[x][y] = 0;
		return true;
	    }
	    public void affichage () {
		p1.affichage();
	    }
	    public int[][] getJeu() {
		return p1.getJeu();
	    }
	    public void setJeu (int [][] jeu) {
		p1.setJeu(jeu);
	    }
} 
 