package Iterator;

public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int inx){
		return books[inx];
	}
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	public int getLength(){
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
