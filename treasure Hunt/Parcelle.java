import java.util.*;
public class Parcelle {
	List<Element> liste;
	private int idx1;
	private int idx2;
	
	Parcelle(int idx1, int idx2){
		this.idx1=idx1;
		this.idx2=idx2;
		liste = new ArrayList<Element>();
		
	}
	public boolean isEmpty(){
		return liste.isEmpty();
	}
	
	public void add(Element element) {
		liste.add(element);
		
	}
	
	public void remove(int idx){
		liste.remove(idx);
	}
		
	public void remove(Element element){
		liste.remove(element);
	}
	
	public String toString() {
		int max=0;
		for (Element f: liste){
			if(f.getPRIORITE()>max){
				max=f.getPRIORITE();
			}
		}
		
		for (Element f: liste){
			if(f.getPRIORITE()==max){
				return f.getSymbole();
			}
		}
		return " ~ ";
	}
	
	public boolean contient(Element e){
		for (Element f: liste){
			if(e.getSymbole().equals(f.getSymbole())){
				return true;
			}
		}
		return false;		
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

