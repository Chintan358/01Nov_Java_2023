package assement;

public class Book {
	
	int bid;
	String bname;
	String author;
	int qty;
	double price;
	String category;
	
	public Book(int bid, String bname, String author, int qty, double price, String category) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.qty = qty;
		this.price = price;
		this.category = category;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", qty=" + qty + ", price=" + price
				+ ", category=" + category + "]";
	}
	
	
	
}
