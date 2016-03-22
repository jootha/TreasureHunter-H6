import java.util.*;
public class Ile {
	private Parcelle [][]tab;
	private int taille;
	private int proportion;
	
	
	Ile (int taille,int proportion){
		this.tab = new Parcelle[taille][taille];
		this.taille=taille;
		this.proportion=proportion;
		Random r= new Random();
		ileVierge();
		addClef();
		addCoffre();
		tab[0][0].add(new Navire(1));
		tab[taille-1][taille-1].add(new Navire(2));
		addRochers();
	}
	private void ileVierge(){
		Random r= new Random();
		for (int i=0; i<taille; i++){
			for(int j=0; j<taille; j++){
				tab[i][j]=new Parcelle(i,j);
			}
		}	
	}
	
	private void addClef(){
		boolean finit=false;
		Random r= new Random();
		while(!finit){
			int a = r.nextInt(taille);
			int b = r.nextInt(taille);
			if(tab[a][b].isEmpty()){
				tab[a][b].add(new Clef());
				tab[a][b].add(new Rocher());
				finit=true;
			}
		}
	}
	
	private void addCoffre(){
		boolean finit=false;
		Random r= new Random();
		while(!finit){
			int a = r.nextInt(taille);
			int b = r.nextInt(taille);
			if(tab[a][b].isEmpty()){
				tab[a][b].add(new Coffre());
				tab[a][b].add(new Tresor());
				tab[a][b].add(new Rocher());
				finit=true;
			}
		}
	}
	
	private void addRochers(){
		int nbR=0;
		Random r= new Random();
		while(nbR<(taille*taille)*(proportion-2)/100){	
			int a = r.nextInt(taille);
			int b = r.nextInt(taille);
			if(tab[a][b].isEmpty()){
				tab[a][b].add(new Rocher());
				nbR++;	
			}
		}
	}
	
	public boolean clefAccessible(){
		return clefAccessible(1,1);
	}
	
	boolean clefAccessible(int idx1,int idx2){
		for (int i=-1;i<=1;i++){
			for (int j=-1;j<=1;j++){
				if (idx1+i!=0 && idx1+i!=taille-2 && idx2+j!=0 && idx2+j!=taille-2){
					if(tab[idx1+i][idx2+j].contient(new Clef())){
						return true;
					}
					else return clefAccessible(idx1+1,idx2+j);
				}
			}
		}
		return (Boolean) null;
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
	
	public void add(Element element, int idx1, int idx2) {
		tab[idx1][idx2].add(element);
	}

	public static void main(String[] args) {
		Ile ile = new Ile(10,10);
		
		System.out.println(ile);
		System.out.println(ile.clefAccessible());
	}
	
	
}
