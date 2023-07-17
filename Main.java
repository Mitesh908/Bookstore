
public class Test11 //for book,bookstore
{
	public static void main(String args[])
	{
		Bookstore bs = new Bookstore(new Book[5],"delhi","paul");
		bs.addBook(new Book(7001,"let us c","yashwanth",500,"programming"));
		bs.addBook(new Book(7002,"crime","paul",208,"crime"));
		bs.addBook(new Book(7003,"dun","robert",1000,"fun"));
		bs.addBook(new Book(7004,"harrye","joshi",1500,"adventure"));
		bs.addBook(new Book(7002,"dont know","roshan",100,"mystery"));
	 //Book[] book = new Book[5];
	//book[0] = new Book(132,"dare devil","paul",1500,"adventure");
	//Bookstore bookstore = new Bookstore(book,"delhi","paul");
		
		//sir logic
		bs.showAllBook();
		bs.showBookByCategory("jump");
		System.out.println(bs.SearchingBookByTitle("jump"));
		bs.addBook(new Book(7006,"maha bharat","ved vyas",1500,"epic"));
		/*
	try
	{
		bookstore.addBook(book[0]);
		bookstore.addBook(book[0]);
		bookstore.addBook(book[0]);
		bookstore.addBook(book[0]);
		bookstore.addBook(book[0]);
	
		
	}catch (InvalidException e)
	{
		System.out.println(e.getmessage());
	}
	
*/
	}
	
}
