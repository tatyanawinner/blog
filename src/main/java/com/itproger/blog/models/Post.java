package com.itproger.blog.models;

import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;

    private String BOOK_TITLE,BOOK_AUTHOR;

    private int BOOK_PRICE;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getBOOK_TITLE() {
        return BOOK_TITLE;
    }

    public void setBOOK_TITLE(String BOOK_TITLE) {
        this.BOOK_TITLE = BOOK_TITLE;
    }

    public String getBOOK_AUTHOR() {
        return BOOK_AUTHOR;
    }

    public void setBOOK_AUTHOR(String BOOK_AUTHOR) {
        this.BOOK_AUTHOR = BOOK_AUTHOR;
    }

    public int getBOOK_PRICE() {
        return BOOK_PRICE;
    }

    public void setBOOK_PRICE(int BOOK_PRICE) {
        this.BOOK_PRICE = BOOK_PRICE;
    }
}
