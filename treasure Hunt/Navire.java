
public class Navire extends Element {
	
	Navire (int equipe){
		super(" n ",4,true);
		if(equipe==1) setSymbole(" N ");
	}
	
	public boolean praticable(){
		return true;
	}

}
