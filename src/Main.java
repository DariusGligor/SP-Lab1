
public class Main {
	public static void Priting()
	{
		DocumentManager.getInstance().getBook().print();
	}

	public static void main(String[] args) {
	/*Book noapteBuna=new Book("Noapte buna, copii!");
	Author rpGheo=new Author("Radu Pavel Gheo");
	noapteBuna.addAuthor(rpGheo);
	Section cap1=new Section("Capitol 1");
	Section cap11=new Section("Capitol 1.1");
	Section cap111=new Section("Capitol 1.1.1");
	Section cap1111=new Section("SubChapter 1.1.1.1");
	noapteBuna.add(new Paragraph("Multumesc mult celor care...."));
	noapteBuna.add(cap1);
	cap1.add(new Paragraph("Moto capitol"));
	cap1.add(cap11);
	cap11.add(new Paragraph("Text from chapter1.1"));
	cap11.add(cap111);
	cap111.add(cap1111);
	cap1111.add(new Image("Image subchapter 1.1.1.1"));
	noapteBuna.print();
	*/
//		long startTime=System.currentTimeMillis();
//		Image img1 = new Image("Pamela Anderson");
//		Image img2 = new Image("Kim Kardashian");
//		Image img3 = new Image("Kirby Griffin");
//		
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		
//		Section playboyS2 = new	Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		
//		Book playboy = new Book("Playboy");
//		playboy.add(playboyS1);
//		playboy.add(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took "+(endTime-startTime)+ " milliseconds");
//		
//		startTime = System.currentTimeMillis();
//		playboyS1.Print();
//		endTime = System.currentTimeMillis();
//		
//		System.out.println("Printing of the section 1 took "+ (endTime-startTime)+ " miliseconds");
//		
//		startTime = System.currentTimeMillis();
//		playboyS1.Print();
//		endTime = System.currentTimeMillis();
//		
//		System.out.println("Printing again the section 1 took "+ (endTime-startTime)+ " milliseconds");
		
//		long startTime = System.currentTimeMillis();
//		
//		ImageProxy img1 = new ImageProxy("Pamela Anderson");
//		ImageProxy img2 = new ImageProxy("Kim Kardashian");
//		ImageProxy img3 = new ImageProxy("Kirby Griffin");
//		
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		
//		Section playboyS2 = new	Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		
//		Book playboy = new Book("Playboy");
//		playboy.add(playboyS1);
//		playboy.add(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took "+(endTime-startTime)+ " milliseconds");
//		
//		startTime = System.currentTimeMillis();
//		playboyS1.Print();
//		endTime = System.currentTimeMillis();
//		
//		System.out.println("Printing of the section 1 took "+ (endTime-startTime)+ " miliseconds");
//		
//		startTime = System.currentTimeMillis();
//		playboyS1.Print();
//		endTime = System.currentTimeMillis();
//		
//		System.out.println("Printing again the section 1 took "+ (endTime-startTime)+ " milliseconds");
		Book myBook = new Book("My Book");
		DocumentManager.getInstance().setBook(myBook);
		Author me =new Author("My Self");
		myBook.addAuthor(me);
		Section cap1 = new Section("Capitolul 1");
		myBook.add(cap1);
		Paragraph p1 = new  Paragraph("Pargraph 1");
		cap1.add(p1);
		Paragraph p2 = new  Paragraph("Pargraph 2");
		cap1.add(p2);
		Paragraph p3 = new  Paragraph("Pargraph 3");
		cap1.add(p3);
		Paragraph p4 = new  Paragraph("Pargraph 4");
		cap1.add(p4);
		cap1.Print();
		p1.setAlign(new AlignCenter());
		p2.setAlign(new AlignRight());
		p3.setAlign(new AlignLeft());
		System.out.println("Alineat:");
		cap1.Print();
		System.out.println("de la printing:");
		Priting();
	}

}
