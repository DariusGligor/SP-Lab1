
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


}
