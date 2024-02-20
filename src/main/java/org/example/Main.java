package org.example;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(java.lang.String[] args) throws FileNotFoundException {
        LinkedList<Movie> objectList = null;
        Scanner input = new Scanner(System.in);
        int opt = 0;
        while (opt != 3) {
            System.out.println("1. Carregar dados\n2. Exibir dados\n3. Sair");
            System.out.println("digite seu comando:");
            opt = input.nextInt();
            if (opt == 1) {
                try {
                    LinkedList<java.lang.String> movieList = factory.createMovieList("imdb.txt");
                    objectList = factory.createObjectMovieList(movieList);
                    System.out.println("Filmes carregados com sucesso!");
                }catch (FileNotFoundException e){
                    System.out.println("Epa! arquivo origem nao encontrado");
                }
            }if (opt == 2){
                try {
                    for (int i = 0; i < objectList.size(); i++) {
                        System.out.println("#" + (i+1) + " " + objectList.get(i).toString());
                    }
                }catch (NullPointerException e){
                    System.out.println("Epa! utilize a opcao 1 primeiro!");
                }
            }
        }
        System.out.println("Obrigado por utilizar o nosso software UwU");
    }
}