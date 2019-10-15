package edu.mum.cs.cs425.demos.elibrarydemocrudweb.service;

import java.util.List;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb.model.Book;

public interface BookService {

    public abstract Iterable<Book> getAllBooks();
    public abstract Book saveBook(Book book);
    public abstract Book getBookById(Integer bookId);
    public abstract void deleteBookById(Integer bookId);
    public abstract List<Book> searchBooks(String searchString);
}
