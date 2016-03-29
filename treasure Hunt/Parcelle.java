import java.util.*;
public class Parcelle {
	List<Element> liste;
	private int idx1;
	private int idx2;
	private Personnage personnage;
	
	Parcelle(int idx1, int idx2){
		this.idx1=idx1;
		this.idx2=idx2;
		liste = new ArrayList<Element>();
		personnage=null;
	}
	
	public boolean praticable(){
		boolean res=true;
		if(personnage!=null) return false;
		for (Element f : liste){
			res=f.isPraticable();
		}
		return res;
	}
	
	public boolean isEmpty(){
		boolean res=true;
		if(!liste.isEmpty() || personnage!=null)return false;
		return res;
	}
	
	public void add(Element element) {
		liste.add(element);
	}
	
	public void add(Personnage p){
		this.personnage=p;
	}
	public void remove(int idx){
		liste.remove(idx);
	}
		
	public void remove(Element element){
		liste.remove(element);
	}
	public void removePerso(){
		this.personnage=null;
	}
	
	public String toString() {
		if (personnage!=null)return personnage.getSymbole();
		int max=0;
		for (Element f: liste){
			if(f.getPriorite()>max){
				max=f.getPriorite();
			}
		}
		
		for (Element f: liste){
			if(f.getPriorite()==max){
				return f.getSymbole();
			}
		}
		return " ~ ";
	}
	
	public boolean contains(Element e){
		return liste.contains(e);		
	}
	
	public Personnage getPersonnage() {
		return personnage;
	}
	public void setPersonnage(Personnage p) {
		this.personnage = p;
	}
	public int getIdx1() {
		return idx1;
	}

	public void setIdx1(int idx1) {
		this.idx1 = idx1;
	}

	public int getIdx2() {
		return idx2;
	}

	public void setIdx2(int idx2) {
		this.idx2 = idx2;
	}
	
	public void setIdx(int idx1,int idx2){
		this.idx1=idx1;
		this.idx2=idx2;
	}
	

}

