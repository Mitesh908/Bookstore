public class Bookstore extends Book//exception demo
{
     private Book[] bookArr; 
     private int index = 0;
     private String storename;
     private String storelocation;
     Bookstore() {}   

	public Bookstore(Book[] bookArr, String storename, String storelocation)
	{
		this.bookArr = bookArr;
		this.storename = storename;
		this.storelocation = storelocation;
	}

	public Book[] getBookArr() {
		return bookArr;
	}

	public void setBookArr(Book[] bookArr) {
		this.bookArr = bookArr;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStorelocation() {
		return storelocation;
	}

	public void setStorelocation(String storelocation) {
		this.storelocation = storelocation;
	}
/*
	public void addBook(Book book)   //this one is also correct
	{
		for(int i=0;i<5;i++)
		{
			if(bookArr[i]==null)
			{
				bookArr[i]=book;
			} 
			else throw new InvalidException();
		}
	}
	*/
	public boolean addBook(Book book)
	{
		if(index<bookArr.length)
		{
			bookArr[index++] = book;
		    return true;
	    }
			throw new RuntimeException("no more books can be added");
	}
	public boolean SearchingBookByTitle(String bookTitle)
	{
	  //for(int i=0;i<5;i++)
		for(int i=0;i<index;i++)
		  if(bookArr[i].getBooktitle().equals( bookTitle))
			  return true;	 
	          return false;
	}
	public void showBookByCategory(String bookCategory)
	{
		for(int i=0;i<index;i++)
			if(bookArr[i].getCategory().equals(bookCategory))
			{
				System.out.println(bookArr[i].getBookid());
				System.out.println(bookArr[i].getBooktitle());
				System.out.println(bookArr[i].getAuthorname());
				System.out.println(bookArr[i].getPrice());
				
			}
		throw new RuntimeException("no book found");
	}
	public void showAllBook()
	{
		for(int i=0;i<index;i++)		
			{
				System.out.println(bookArr[i].getBookid());
				System.out.println(bookArr[i].getBooktitle());
				System.out.println(bookArr[i].getAuthorname());
				System.out.println(bookArr[i].getPrice());
				
			}
	}
}
