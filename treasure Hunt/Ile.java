import java.util.*;
public class Ile {
	Parcelle [][]tab;
	int taille;
	
	
	Ile (int taille){
		this.tab = new Parcelle[taille][taille];
		this.taille=taille;
		Random r= new Random();
		for (int i=0; i<taille; i++){
			for(int j=0; j<taille; j++){
				tab[i][j]=new Parcelle(i,j);
				//tab[i][j].add(new Vide()); deplacer dans le constructeur de parcelle
				if(r.nextInt(10)==1){
					tab[i][j].remove(0);
					tab[i][j].add(new Rocher());
			
				}
					
			}
	
		}
	}
	
	
	
	public String toString() {
		String res="";
		for (int i=0; i<taille; i++){
			res=res+"+---+---+---+---+---+---+---+---+---+---+\n|";
			for (int j=0; j<taille; j++){
				res =res + tab[i][j]+ "|";
			}
			res = res + "\n";
		}
		res=res+"+---+---+---+---+---+---+---+---+---+---+\n|";
		
		return res;
	}
	
	public void add(Element element, int idx1, int idx2) {
		tab[idx1][idx2].add(element);
	}

	
		
	
}
