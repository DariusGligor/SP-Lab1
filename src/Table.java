
public class Table implements Element{

	
	private String name;
	public Table(String name)
	{
		this.name=name;
	}
	@Override
	public void Print() {
		System.out.println("Table: "+ name);
	}


}
