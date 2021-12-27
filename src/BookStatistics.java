
public class BookStatistics implements Visitor {

	public BookStatistics() {}
	private int numberOfAuthors = 0;
	private int numberOfTable = 0;
	private int numverOfSection = 0;
	private int numberOfParagraph = 0;
	private int numberOfImageProxy = 0;
	private int numberOfImages = 0;
	
	@Override
	public void visit(Book book) {
		this.numberOfAuthors = 0;
		this.numberOfTable = 0;
		this.numverOfSection = 0;
		this.numberOfParagraph = 0;
		this.numberOfImageProxy = 0;
		this.numberOfImages = 0;
		
	}

	@Override
	public void visit(Section section) {
		for(Element el : section.elements)
		{
			if(el instanceof Table) {
				this.numberOfTable++;
			}
			else if(el instanceof Paragraph) {
				this.numberOfParagraph++;
			}
			else if( el instanceof ImageProxy)
			{
				this.numberOfImageProxy++;
			}
			else if(el instanceof Image)
			{
				this.numberOfImages++;
			}	
		}
		System.out.println("Book Statistics:");
		
		if(this.numberOfImages > 0)
		{
			 System.out.println("   Number Of images: "+ this.numberOfImages);
		}
		
		if(this.numberOfTable > 0)
		{
			 System.out.println("   Number Of table: "+ this.numberOfTable);
		}
		
		if(this.numberOfParagraph > 0)
		{
			 System.out.println("   Number Of paragraph: "+ this.numberOfParagraph);
		}
		
		if(this.numberOfImageProxy > 0)
		{
			 System.out.println("   Number Of ProxyImages: "+ this.numberOfImageProxy);
		}
	}

	@Override
	public void visit(Paragraph par) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ImageProxy image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Table table) {
		// TODO Auto-generated method stub
		
	}
	public void printStatistics() {
		
	}
}
