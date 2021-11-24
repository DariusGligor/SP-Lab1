
public class AlignLeft implements IAlignStrategy {

	@Override
	public String render(String paragraphText) {
		return "##"+paragraphText;
	}
}
