package org.example;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Main {
    public static void main(java.lang.String[] args) throws FileNotFoundException {
        //opt1
        LinkedList<java.lang.String> movieList = factory.createMovieList("Movies.txt");
        LinkedList<Movie> objectList = factory.createObjectMovieList(movieList);
        //opt2
        for (int i = 0; i < objectList.size(); i++) {
            System.out.println("#"+i+" "+objectList.pop().toString());
        }


    }
}