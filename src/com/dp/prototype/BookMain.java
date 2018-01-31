package com.dp.prototype;

public class BookMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadBooks();
		
		BookShop bs2 = bs.clone();
		bs2.setShopName("Xyz");
		bs.getBooks().remove(2);
		System.out.println(bs);
		System.out.println(bs2);
	}
}
