package com.example.demo.BooksEntity;

import javax.persistence.*;

@Entity
@Table(name = "BooksEntity")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private  String title;
    @Column(nullable = false)
    private String author;

    public Long  getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPub_date() {
        return pub_date;
    }

    public void setPub_date(String pub_date) {
        this.pub_date = pub_date;
    }

    public String getEdittion() {
        return edittion;
    }

    public void setEdittion(String edittion) {
        this.edittion = edittion;
    }

    @Column(nullable = false)
    private String pub_date;
    @Column(nullable = false)
    private String edittion;


}
