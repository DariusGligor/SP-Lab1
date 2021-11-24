
public class Paragraph implements Element{

	private String name;
	private IAlignStrategy align;
	public Paragraph(String name)
	{
		this.name=name;
	}
	public void setAlign(IAlignStrategy align) {
		this.align = align;
	}
	@Override
	public void Print() {
		if(align == null)
		System.out.println("Paragraph: "+ name);
		else 
			System.out.println("Paragraph: "+ align.render(name));
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
