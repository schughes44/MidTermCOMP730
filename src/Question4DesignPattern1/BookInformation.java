package Question4DesignPattern1;

public class BookInformation {
	private String author;
	private String title;
	private int year;
	private String summary;
	private SortBook bookSort;
	

	public BookInformation(String a, String t, int y, String s) {
		this.author = a;
		this.title = t;
		this.year = y;
		this.summary = s;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSortMethod(SortBook sort) {
		bookSort = sort;
	}
}

