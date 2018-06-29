package com.dore.bookmarks.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.dore.account.models.Account;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bookmark {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Account account;

    private String uri;

    private String description;

    private Bookmark() {}

    public Bookmark(final Account account, final String uri, final String description){
        this.account = account;
        this.uri = uri;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }
}