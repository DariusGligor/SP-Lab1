
public class AlignRight implements IAlignStrategy {

	@Override
	public String render(String paragraphText) {
		return paragraphText+ "##";
	}
}
