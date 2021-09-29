import java.util.ArrayList;
import java.util.List;

public class Book {
	private String name;
	private List<String> paragraphs;
	private List<String> images;
	private List<String> tables;
	public Book(String bookName)
	{
		this.name=bookName;
		this.paragraphs=new ArrayList<String>();
		this.images=new ArrayList<String>();
		this.tables=new ArrayList<String>();
	}
	public void createNewParagraph(String paragraphName)
	{
		this.paragraphs.add(paragraphName);
	}
	public void createNewImage(String imageName)
	{
		this.images.add(imageName);
	}
	public void createNewTable(String tableName)
	{
		this.tables.add(tableName);
	}
	public void Print()
	{
		String print="";
		print=print+this.name+"\n";
		print=print+"Paragraphs: ";
		for(String x : this.paragraphs)
		{
			print=print+ x+"\n";
		}
		print=print+"Images: ";
		for(String x : this.images)
		{
			print=print+ x+"\n";
		}
		print=print+"Tables: ";
		for(String x : this.tables)
		{
			print=print+ x+ "\n";
		}
		System.out.println(print);
	}
}
