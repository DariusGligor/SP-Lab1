
public class AlignCenter implements IAlignStrategy {

	@Override
	public String render(String paragraphText) {
		return "##"+paragraphText+ "##";
	}
}
