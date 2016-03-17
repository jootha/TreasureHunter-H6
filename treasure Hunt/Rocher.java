
public class Rocher implements Element {
	private String symbole;
	private final int PRIORITE=3;
	Rocher (){
		this.symbole=" R ";
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
