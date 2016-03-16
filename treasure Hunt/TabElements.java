import java.util.List;
import java.util.ArrayList;
public class TabElements {
	List <Element> l;
	
	TabElements(){
		this.l=new ArrayList <Element> ();
	}

	public List<Element> getL() {
		return l;
	}

	public void setL(List<Element> l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "TabElements [l=" + l + ", getL()=" + getL() + ", toString()=" + super.toString() + "]";
	}

	public boolean add(Element e) {
		return l.add(e);
	}

	public void add(int index, Element element) {
		l.add(index, element);
	}
	
}
