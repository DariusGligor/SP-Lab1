import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	private String name;
	public List<Element>elements;
	public Section(String name)
	{
		this.name=name;
		this.elements=new ArrayList<Element>();
	}
	
	@Override
	public void add(Element element) {
		elements.add(element);
	}
	@Override
	public void remove(Element element) {
	elements.remove(element);
	}
	@Override
	public Element get(int index) {
		return elements.get(index);
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
