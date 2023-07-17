public class Book 
{
   int bookid;
   String booktitle;
   String authorname;
   double price;
   String category;
    Book() {}
	public Book(int bookid, String booktitle, String authorname, double price, String category) {
		
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.authorname = authorname;
		this.price = price;
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}    
}
