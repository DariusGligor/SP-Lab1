
public interface Visitor {
	void visit(Book book);
	void visit(Section section);
	void visit(Paragraph par);
	void visit(ImageProxy image);
	void visit(Image image);
	void visit(Table table);
}
