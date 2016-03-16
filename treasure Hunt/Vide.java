
public class Vide implements Element {

	private String symbole;
	private final int PRIORITE=1;

	public Vide (){
		this.symbole=" ";
	}
	
		
	public boolean praticable(){
		return true;
	}

	
	public String toString(){
		return this.symbole;
	}

	public String getSymbole() {
		return symbole;
	}

		
	public int getPRIORITE (){
		return this.PRIORITE;
	}

}