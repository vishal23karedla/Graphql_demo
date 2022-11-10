package com.example.GqlDemo.bookDetails;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @QueryMapping
    public String hello(){
        return "Hello GraphQL users!" ;
    }

    @QueryMapping
    public int sum(@Argument int a,@Argument int b){
        return (a+b);
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.getAuthorId());
    }

    @SchemaMapping
    public Publication publication(Book book){
        return Publication.getById((book.getPublicationId()));
    }
}

// The @QueryMapping annotation binds this method to a query, a field under the Query type. The query field is then determined from the method name, bookById;
// Use the @Argument annotation to have an argument bound to a target object and injected into the handler method. By default, the method parameter name is used to look up the argument. The argument name can be specified in the annotation.

//    The @SchemaMapping annotation maps a handler method to a field in the GraphQL schema and declares it to be the DataFetcher for that field.
//    The field name defaults to the method name, and the type name defaults to the simple class name of the source/parent object injected into the method.
//    In this example, the field defaults to author and the type defaults to Book. The type and field can be specified in the annotation.


