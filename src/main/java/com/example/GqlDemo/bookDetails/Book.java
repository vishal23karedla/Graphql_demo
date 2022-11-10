package com.example.GqlDemo.bookDetails;

import java.util.List;
import java.util.Arrays;

public class Book {

    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    private String publicationId;

    public Book(String id, String name, int pageCount, String authorId, String publicationId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
        this.publicationId = publicationId;
    }

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1", "publication-1"),
            new Book("book-2", "Moby Dick", 635, "author-2", "publication-2"),
            new Book("book-3", "Interview with the vampire", 371, "author-3","publication-3")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getPublicationId(){
        return  publicationId;
    }
}