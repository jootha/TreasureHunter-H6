
public class Eau implements Element {
	private String symbole;
	private final int PRIORITE=3;

	Eau (){
		this.symbole=" E ";
	}
	
	public boolean praticable(){
		return false;
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


