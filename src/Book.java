import java.util.ArrayList;
import java.util.List;

public class Book {
	private String name;
	
	private List<Author> authors;
	private List<Chapter>chapters;
	public Book(String bookName)
	{
		this.name=bookName;
		
		this.authors=new ArrayList<Author>();
		this.chapters=new ArrayList<Chapter>();	
	}

	public void addAuthor(Author a)
	{
		this.authors.add(a);
	}
	public int createChapter(String nameChapter)
	{
		this.chapters.add(new Chapter(nameChapter));
		return (this.chapters.size()-1);
	}
	public Chapter getChapter(int i)
	{
		return chapters.get(i);
	}

}
