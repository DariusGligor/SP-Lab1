import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<Element> elements;
	
	
	public SubChapter(String name) {
		this.name=name;
		this.elements=new ArrayList<Element>();
	}
	public void createNewParagraph(String paragraphName)
	{
		Paragraph p=new Paragraph(paragraphName);
		this.elements.add(p);
	}
	public void createNewImage(String imageName)
	{
		Image img=new Image(imageName);
		this.elements.add(img);
	}
	public void createNewTable(String tableName)
	{	
		Table table =new Table(tableName);
		this.elements.add(table);
	}
	public void Print()
	{
		for(Element el : elements)
		{
			el.Print();
		}
	}
}
