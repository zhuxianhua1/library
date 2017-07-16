package com.hua.library.entity;

public class Tb_purview {
    private Integer id;

    private Boolean sysset;

    private Boolean readerset;

    private Boolean bookset;

    private Boolean borrowback;

    private Boolean sysquery;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSysset() {
        return sysset;
    }

    public void setSysset(Boolean sysset) {
        this.sysset = sysset;
    }

    public Boolean getReaderset() {
        return readerset;
    }

    public void setReaderset(Boolean readerset) {
        this.readerset = readerset;
    }

    public Boolean getBookset() {
        return bookset;
    }

    public void setBookset(Boolean bookset) {
        this.bookset = bookset;
    }

    public Boolean getBorrowback() {
        return borrowback;
    }

    public void setBorrowback(Boolean borrowback) {
        this.borrowback = borrowback;
    }

    public Boolean getSysquery() {
        return sysquery;
    }

    public void setSysquery(Boolean sysquery) {
        this.sysquery = sysquery;
    }
}