package _0104.com.oop.book.model;

public class Book {
	private String title;
	private int price;
	private int discountRate;
	private String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, int price, int discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void information() {
		System.out.println("title = " + title + ", price = " + price + ", discount rate = " + discountRate + 
				", author = " + author);
	}
	
	

}
