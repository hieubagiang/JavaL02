/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThucHanh1.Bai10;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Book implements Serializable{
    private String id;
    private String authors;
    private String titles;
    private String category;

    public Book(String id, String authors, String titles, String category) {
        this.id = id;
        this.authors = authors;
        this.titles = titles;
        this.category = category;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
