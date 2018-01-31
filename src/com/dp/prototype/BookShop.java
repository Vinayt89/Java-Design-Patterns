package com.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String shopName;
	private List<Book> books = new ArrayList<>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void loadBooks() {
		for (int i = 1; i < 5; i++) {
			Book book = new Book();
			book.setbId(i);
			book.setbName("Book " + i);
			getBooks().add(book);
		}
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();

		for (Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", shops=" + books + "]";
	}
}
