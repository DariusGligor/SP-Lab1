import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String name;
	private List<SubChapter>subchapters;
	public Chapter(String name)
	{
		this.name=name;
		this.subchapters=new ArrayList<SubChapter>();
	}
	public int createSubChapter(String nameSubChapter)
	{
		SubChapter subChapter=new SubChapter(nameSubChapter);
		subchapters.add(subChapter);
		return subchapters.size()-1;
	}
	public SubChapter getSubChapter(int i)
	{
		return subchapters.get(i);
	}
}
