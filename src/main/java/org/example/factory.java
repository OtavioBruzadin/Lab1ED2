package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class factory {
    public static LinkedList<java.lang.String> createMovieList(java.lang.String file) throws FileNotFoundException {
        try {
            LinkedList<java.lang.String> list = new LinkedList<>();
            File myObj = new File(java.lang.String.valueOf(file));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                java.lang.String data = myReader.nextLine();

                list.add(data);

            }
            myReader.close();
            return list;

        } catch (FileNotFoundException e) {

            throw e;
        }
    }

    public static LinkedList<Movie> createObjectMovieList(LinkedList<String> movies){
        LinkedList<Movie> MovieList = new LinkedList<>();
        for (int i = 0; i < movies.size(); i=i+3) {
            Movie movie = new Movie(movies.get(i),Integer.parseInt(movies.get(i+1)),Double.parseDouble(movies.get(i+2)));
            MovieList.add(movie);
        }
        return MovieList;
    }
}
