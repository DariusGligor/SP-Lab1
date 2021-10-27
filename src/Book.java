import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
	List<Author> authors;
	public Book(String bookName)
	{
		super(bookName);
		authors=new ArrayList<Author>();
	}
	public void addAuthor(Author author)
	{
		authors.add(author);
	}
	public void print()
	{
		System.out.print("Book: ");
		for(Author a: authors)
		{
			a.Print();
		}
		super.Print();
	}
}
