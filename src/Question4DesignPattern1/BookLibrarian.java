package Question4DesignPattern1;

import java.util.ArrayList;
import java.util.List;


public class BookLibrarian {
	private List<BookInformation> bookList= new ArrayList<BookInformation>();
	private SortBook bookSort;
	
	public BookLibrarian() {
		
	}
	
	public boolean addBook(BookInformation book) {
		bookList.add(book);
		return true;
	}
	
	public boolean removeItem(BookInformation book) {
		if (bookList.contains(book)) {
			bookList.remove(book);
			return true;
		}
		return false;
	}
	public void setSortMethod(SortBook bookSort) {
		this.bookSort = bookSort;
	}
	
	public void printList() {
		List<BookInformation> sortedList;
		
		if (bookSort == null) {
			sortedList = bookList;
		}
		
		else {
			sortedList = bookSort.sort(bookList);
		}
		for(BookInformation g : bookList ) {
			System.out.println("Author: " + g.getAuthor() + "\n" + "Title: " + g.getTitle() + "\n" + "Year Published: " + g.getYear() + "\n" + "Summary: " + g.getSummary() + "\n");
		}
	}
}
