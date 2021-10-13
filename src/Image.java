
public class Image implements Element {

	private String name;
	public Image(String name)
	{
		this.name=name;
	}
	@Override
	public void Print() {
		System.out.println("Image: "+ name);
	}

}
