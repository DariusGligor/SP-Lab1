
public final class DocumentManager {
private static volatile DocumentManager documentManager = null;
private Book book;
private DocumentManager()
{}
public static DocumentManager getInstance()
{
	if(documentManager == null)
		documentManager = new DocumentManager();
	return documentManager;
}
public Book getBook() {
	return this.book;
}
public void setBook(Book bookpa) {
	this.book= bookpa;
}
}
