
public class Navire implements Element {
	private String symbole;
	private final int PRIORITE=4;
	Navire (){
		this.symbole=" N ";
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
