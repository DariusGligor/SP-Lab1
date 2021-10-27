
public class Paragraph implements Element{

	private String name;
	public Paragraph(String name)
	{
		this.name=name;
	}
	@Override
	public void Print() {
		System.out.println("Paragraph: "+ name);
	}
	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Element get(int index) {
		// TODO Auto-generated method stub
		return null;
	}


}
