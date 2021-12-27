
public class ImageProxy implements Element {
	private String name;
	private Image realImage;
	public ImageProxy(String name)
	{
		this.name=name;
	}
	Image loadImage()
	{
		if(realImage == null) {
			realImage = new Image(name);
		}
		return realImage;
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
