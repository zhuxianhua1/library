package com.hua.library.entity;

public class Tb_publishing {
    private String isbn;

    private String pubname;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getPubname() {
        return pubname;
    }

    public void setPubname(String pubname) {
        this.pubname = pubname == null ? null : pubname.trim();
    }
}