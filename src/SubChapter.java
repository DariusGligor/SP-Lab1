import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<String> images;
	private List<String> tables;
	private List<String> paragraphs;
	
	public SubChapter(String name) {
		this.name=name;
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
		String print="Subchapter";
		print=print+this.name+"\n";
		print=print+"Paragraphs: ";
		for(String x : this.paragraphs)
		{	print=print+"Paragraph: ";
			print=print+ x+"\n";
		}
		
		for(String x : this.images)
		{	print=print+"Image: ";
			print=print+ x+"\n";
		}
	
		for(String x : this.tables)
		{print=print+"Table: ";
			print=print+ x+ "\n";
		}
		System.out.println(print);
	}
}
