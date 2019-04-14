package Question4DesignPattern1;

public class RunStrategyPattern {
	public static void main(String a[]){
		BookLibrarian library = new BookLibrarian();
		
		library.addBook(new BookInformation("Smith, Frank", "SmithFrank: part 1", 1991, "Autobiography of Frank Smith: Part 1"));
		library.addBook(new BookInformation("Smith, Frank", "SmithFrank: part 2", 1992, "Autobiography of Frank Smith: Part 2"));
		library.addBook(new BookInformation("Smith, Frank", "SmithFrank: part 3", 1993, "Autobiography of Frank Smith: Part 3"));
		library.addBook(new BookInformation("Smith, Frank", "SmithFrank: part 4", 1994, "Autobiography of Frank Smith: Part 4"));
		library.addBook(new BookInformation("Smith, Frank", "SmithFrank: part 5", 1995, "Autobiography of Frank Smith: Part 5"));
		library.addBook(new BookInformation("Best, Annie", "Besty Best: part 1", 2004, "The best of the best: Part 1"));
		library.addBook(new BookInformation("Best, Annie", "Besty Best: part 2", 2005, "The best of the best: Part 2"));
		library.addBook(new BookInformation("Best, Annie", "Besty Best: part 3", 2007, "The best of the best: Part 3"));
		library.addBook(new BookInformation("Best, Annie", "Besty Best: part 4", 2014, "The best of the best: Part 4"));
		library.addBook(new BookInformation("Best, Annie", "Besty Best: part 5", 2018, "The best of the best: Part 5"));
		library.addBook(new BookInformation("Walters, Shawn", "Water Water: part 1", 2010, "Everybody loves water: Part 1"));
		library.addBook(new BookInformation("Walters, Shawn", "Water Water: part 2", 2011, "Everybody loves water: Part 2"));
		library.addBook(new BookInformation("Walters, Shawn", "Water Water: part 3", 2012, "Everybody loves water: Part 3"));
		library.addBook(new BookInformation("Walters, Shawn", "Water Water: part 4", 2013, "Everybody loves water: Part 4"));
		library.addBook(new BookInformation("Walters, Shawn", "Water Water: part 5", 2014, "Everybody loves water: Part 5"));
		library.addBook(new BookInformation("Shmamala, Pamela", "Badda Bing: part 1", 1957, "You know: Part 1"));
		library.addBook(new BookInformation("Shmamala, Pamela", "Badda Bing: part 2", 1967, "You know: Part 2"));
		library.addBook(new BookInformation("Shmamala, Pamela", "Badda Bing: part 3", 1977, "You know: Part 3"));
		library.addBook(new BookInformation("Shmamala, Pamela", "Badda Bing: part 4", 1987, "You know: Part 4"));
		library.addBook(new BookInformation("Shmamala, Pamela", "Badda Bing: part 5", 1997, "You know: Part 5"));
		
		System.out.println("No Sort" + "\n" + "\n");
		library.printList();
		
		System.out.println("Sorted by Author Last Name" + "\n" + "\n");
		library.setSortMethod(new SortBook("author"));
		library.printList();
	}
}
