package Iterator;

public class BookShelfIterator implements Iterator{
	
	private BookShelf bookshelf;
	private int idx;
	public BookShelfIterator(BookShelf bookShelf){
		this.bookshelf = bookShelf;
		this.idx = 0;
	}
	@Override
	public boolean hasNext() {
		if(idx < bookshelf.getLength()) return true;
		return false;
		
	}
	@Override
	public Object next() {
		Book book = bookshelf.getBookAt(idx);
		idx++;
		return book;
	}
}
