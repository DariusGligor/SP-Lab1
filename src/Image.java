import java.util.concurrent.TimeUnit;

public class Image implements Element {

	private String name;
	public Image(String name)
	{
		this.name=name;
		try {
		TimeUnit.SECONDS.sleep(5);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
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
