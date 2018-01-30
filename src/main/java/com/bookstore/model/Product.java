package com.bookstore.model;

import java.time.LocalDate;

/**
 * @author Shaheer
 */
public class Product extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	private String isbn;
	private String title;
	private float price;
	private LocalDate pubDate;
	private String description;
	private String imageUrl;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * The product ISBN is unique for each Product. So this should compare Product by
	 * ISBN only.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		return (other instanceof Product) && (isbn != null) ? isbn.equals(((Product) other).isbn) : (other == this);
	}

	/**
	 * The product ISBN is unique for each Product. So Product with same ISBN should
	 * return same hashcode.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (isbn != null) ? (this.getClass().hashCode() + isbn.hashCode()) : super.hashCode();
	}

	/**
	 * Returns the String representation of this product. Not required, it just
	 * pleases reading logs.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("product[isbn=%s,title=%s,price=%d,publishedDate=%s,description=%s]", isbn, title, price,
				pubDate, description);
	}

}
