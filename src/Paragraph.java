
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
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}


}
