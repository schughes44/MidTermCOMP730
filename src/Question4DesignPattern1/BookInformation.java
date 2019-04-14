package Question4DesignPattern1;

public class BookInformation {
	private String author;
	private String title;
	private int year;
	private String summary;
	
	

	public BookInformation(String a, String t, int y, String s) {
		author = a;
		title = t;
		year = y;
		summary = s;
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
}

