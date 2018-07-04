/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u4;

import java.util.Objects;

/**
 *
 * @author 1mohamedyou
 */
public class Book {

    // CLASS CONSTANTS
    static final String[] GENRE = {"Fiction", "Non-Fiction"};
    static final String PUBLISHER = "GWPC";

    // CLASS VARIABLES
    private static int lastID = 0;
    // OBJECT VARIABLES
    private long id;
    private int nOfPages;
    private int edition;
    private String title;
    private String author;
    private int genreId;

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", nOfPages=" + nOfPages + ", title=" + title + ", author=" + author + '}';
    }

    public Book(int edition, String title, String author) {
        this.edition = edition;
        this.title = title;
        this.author = author;
        this.id = ++lastID;
    }

    public Book(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public int getnOfPages() {
        return nOfPages;
    }

    public void setnOfPages(int nOfPages) {
        this.nOfPages = nOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenreId(int genreId) {
        if (genreId < 1 || genreId > GENRE.length - 1) {
            this.genreId = 0;
        }
        else {
            this.genreId = genreId;
        }
    }

    public String getGenre() {
        return GENRE[genreId];
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.edition != other.edition) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.author, other.author);
    }
    
    
}
