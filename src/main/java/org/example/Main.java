package org.example;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Main {
    public static void main(java.lang.String[] args) throws FileNotFoundException {
        LinkedList<Movie> MovieList = new LinkedList<>();
        Movie movie = new Movie("incriveis",2004,8.0);
        MovieList.add(movie);
        LinkedList<java.lang.String> movieList = factory.createMovieList("Movies.txt"); // cria Lista de filmes
        LinkedList<Movie> objectList = factory.createObjectMovieList(movieList); // cria lista de objetos filme


        System.out.println(objectList.pop().toString());
        System.out.println(objectList.pop().toString());
        System.out.println(objectList.pop().toString());
        System.out.println(objectList.pop().toString());
        System.out.println(objectList.pop().toString());

    }
}