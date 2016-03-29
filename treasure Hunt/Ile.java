import java.util.*;

public class Ile {
	Parcelle [][]tab;
	private int taille;
	private double proportion;
	
	
	Ile (int taille,double proportion){
		this.tab = new Parcelle[taille][taille];
		this.taille=taille;
		this.proportion=proportion;
		genereIleVierge();
		genereClef();
		genereCoffre();
		genereEau();
		tab[0][1].add(new Navire(1));
		tab[taille-1][taille-2].add(new Navire(2));
		genereRochers();
		tab[1][1].add(new Explorateur());
		deplacer(1,1,5,5);
	}
	
	private void genereIleVierge(){
		for (int i=0; i<taille; i++){
			for(int j=0; j<taille; j++){
				tab[i][j]=new Parcelle(i,j);
			}
		}	
	}
	
	private void genereClef(){
		boolean finit=false;
		Random r= new Random();
		while(!finit){
			int a = r.nextInt(taille-2)+1;
			int b = r.nextInt(taille-2)+1;
			if(tab[a][b].isEmpty()){
				tab[a][b].add(new Clef());
				tab[a][b].add(new Rocher());
				finit=true;
			}
		}
	}
	
	private void genereCoffre(){
		boolean finit=false;
		Random r= new Random();
		while(!finit){
			int a = r.nextInt(taille-2)+1;
			int b = r.nextInt(taille-2)+1;
			if(tab[a][b].isEmpty()){
				tab[a][b].add(new Coffre());
				tab[a][b].add(new Tresor());
				tab[a][b].add(new Rocher());
				finit=true;
			}
		}
	}
	
	private void genereEau(){
		for(int i=0;i<taille;i++){
			tab[i][0].add(new Eau());			
			tab[0][i].add(new Eau());			
			tab[i][taille-1].add(new Eau());			
			tab[taille-1][i].add(new Eau());			
		}		
	}
	
	
	private void genereRochers(){
		int nbR=0;
		Random r= new Random();
		while(nbR<(taille*taille)*((proportion*100)-2)/100){	
			int a = r.nextInt(taille-2)+1;
			int b = r.nextInt(taille-2)+1;
			if(tab[a][b].isEmpty()){
				tab[a][b].add(new Rocher());
				nbR++;	
			}
		}
	}

	
	
	public void add(Element element, int idx1, int idx2) {
		tab[idx1][idx2].add(element);
	}
	
	
	public void deplacer(int x,int y,int idx1, int idx2){// move Element in x,y to idx1,idx2
		//if(tab[x][y].getPersonnage() instanceof Explorateur &&tab[idx1][idx2].contains(new Rocher())){ explore tab[x][y];
			
		
		if(depValide(x,y,idx1,idx2)){
		tab[idx1][idx2].add(tab[x][y].getPersonnage());
		tab[x][y].removePerso();
		}
	}
	
	public boolean depValide(int x,int y,int idx1, int idx2){
		//if(tab[x][y].getPersonnage()!=null)return false;
		return tab[idx1][idx2].praticable();
	}
	
	public String toString() {
		String res="";
		for (int i=0; i<taille; i++){
			for (int j=0; j<taille; j++){
				res=res+"+---";
			}
			res+="+\n";
			for (int j=0; j<taille; j++){
				if(tab[i][j].isEmpty()){
					res =res + "|   ";
				}
				else res =res + "|"+ tab[i][j];
			}
			res = res + "|\n";
		}
		for (int j=0; j<taille; j++){
			res=res+"+---";
		}
		res+="+";
		return res;
	}
	
	public static void main(String[] args) {
		Ile ile = new Ile(10,0.10);
		
		System.out.println(ile);
		
		/*int nbR=0;
		for (int i=0; i<ile.taille; i++){
			for (int j=0; j<ile.taille; j++){
				if(ile.tab[i][j].contains(new Rocher()))nbR+=1;
			}
		}
		System.out.println(nbR);*/
	}
}
