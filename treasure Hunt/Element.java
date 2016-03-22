
public class Element {
	private String symbole;
	private int priorite;
	boolean praticable;

	Element(){}

	public Element(String symbole, int priorite, boolean praticable) {
		super();
		this.symbole = symbole;
		this.priorite = priorite;
		this.praticable = praticable;
	}

	public String getSymbole() {
		return symbole;
	}
	
	public boolean praticable(){
		return false;
	}
	
	public int getPriorite() {
		return priorite;
	}
	
	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}
	
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	
	public boolean isPraticable() {
		return praticable;
	}

	public void setPraticable(boolean praticable) {
		this.praticable = praticable;
	}

	public String toString(){
		return this.symbole;
	}
	
}
