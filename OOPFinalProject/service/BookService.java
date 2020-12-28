package com.service;

import com.model.Book;

public class BookService {

    public void printAll(Book[] arr) {
        for (Book x : arr) {
            System.out.println(x);
        }
    }
}
