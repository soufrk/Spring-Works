package beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Book {
	
	private String name;
	private String isbn;
	private String publisher;
	private String author;
	
	public void setName(String name) {
		System.out.println("Setter of name in Book invoked");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		System.out.println("Setter of isbn in Book invoked");
		this.isbn = isbn;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		System.out.println("Setter of publisher in Book invoked");
		this.publisher = publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		System.out.println("Setter of author in Book invoked");
		this.author = author;
	}
	
	/*public Book() {
		System.out.println("contructor of Book");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method of Book");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method of Book");
	}*/

}
