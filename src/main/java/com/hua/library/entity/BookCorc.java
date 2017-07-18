package com.hua.library.entity;

import java.util.Date;

public class BookCorc {
		private String barcode;

	    private String bookname;

	    private String typename;

	    private String name;

	    private String pubname;

	    private String author;

	    private Float price;	      
	    

		@Override
		public String toString() {
			return "BookCorc [barcode=" + barcode + ", bookname=" + bookname + ", typename=" + typename + ", name="
					+ name + ", pubname=" + pubname + ", author=" + author + ", price=" + price + "]";
		}

		public String getBarcode() {
			return barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public String getBookname() {
			return bookname;
		}

		public void setBookname(String bookname) {
			this.bookname = bookname;
		}

		public String getTypename() {
			return typename;
		}

		public void setTypename(String typename) {
			this.typename = typename;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPubname() {
			return pubname;
		}

		public void setPubname(String pubname) {
			this.pubname = pubname;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public Float getPrice() {
			return price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

	    
}