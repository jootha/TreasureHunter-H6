
public class Clef implements Element {
	
	private String symbole;
	private final int PRIORITE=2;

	Clef (){
				this.symbole=" K ";
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

