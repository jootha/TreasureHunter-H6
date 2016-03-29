
public abstract class Personnage {
	private String symbole;
	private boolean clef;
	private boolean tresor;
	
	Personnage(){
		super();
	}
	Personnage(String symbole){
		this.symbole=symbole;
		clef=false;tresor=false;
	}
	public String getSymbole() {
		return symbole;
	}
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	public boolean isClef() {
		return clef;
	}
	public void setClef(boolean clef) {
		this.clef = clef;
	}
	public boolean isTresor() {
		return tresor;
	}
	public void setTresor(boolean tresor) {
		this.tresor = tresor;
	}
	
}
	
