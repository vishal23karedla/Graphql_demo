package com.example.GqlDemo.bookDetails;

import java.util.Arrays;
import java.util.List;

public class Publication {

    private String id;

    private String publisherName;

    private int establishedYear;

    public Publication(String id, String publisherName, int establishedYear) {
        this.id = id;
        this.publisherName = publisherName;
        this.establishedYear = establishedYear;
    }

    private static List<Publication> publications = Arrays.asList(
            new Publication("publication-1", "Dhoni", 2000),
            new Publication("publication-2", "Virat", 2003),
            new Publication("publication-3", "Surya", 2007)
    );

    public static Publication getById(String id) {
        return publications.stream().filter(publication -> publication.getId().equals(id)).findFirst().orElse(null);
    }


    //Setters and Getters
    //Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //publisherName
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    //establishedYear
    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    //publications
    public static List<Publication> getPublications() {
        return publications;
    }

    public static void setPublications(List<Publication> publications) {
        Publication.publications = publications;
    }
}
