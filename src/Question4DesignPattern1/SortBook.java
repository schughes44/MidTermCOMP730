package Question4DesignPattern1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBook {
	String sort;
	
	public SortBook (String y) {
		sort = y;
	}
	
	public List<BookInformation> sortAuthor(List<BookInformation> book) {
		Collections.sort(book, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation book1, BookInformation book2) {
				return String.valueOf(book1.getAuthor()).compareTo(book2.getAuthor());
			}
		}
		);
		
		return book;
	}

	public List<BookInformation> sort(List<BookInformation> bookList) {
		List<BookInformation> sorted;
		
		if (sort == "author") {
			sorted = sortAuthor(bookList);
			return sorted;
		}
		else {
			return bookList;
		}
	}
}
