package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        Actor jimCarey = new Actor("Jim", "Carey");
        Actor salmaHayek = new Actor("Salma", "Hayek");
        Actor angelinaJolie = new Actor("Angelina", "Jolie");
        Actor bradPitt = new Actor("Brad", "Pitt");
        Actor hughJackman = new Actor("Hugh", "Jackman");
        Actor robertDowneyJr = new Actor("Robert", "Downey Jr.");
        Actor harrisonFord = new Actor("Harrison", "Ford");
        Actor marlonBrando = new Actor("Marlon", "Brando");

        Director stanleyKubrick = new Director("Stanley", "Kubrick");
        Director wesAnderson = new Director("Wes", "Anderson");
        Director quentinTarantino = new Director("Quentin", "Tarantino");

        List<Film> films = new ArrayList<>();
        films.add(new Film("'Zmyślony tytuł'", "comedy", 1999, stanleyKubrick, new ArrayList<>(asList(angelinaJolie, bradPitt, harrisonFord))));
        films.add(new Film("'Nie ma takiego filmu'", "SCI-FI", 2007, quentinTarantino, new ArrayList<>(asList(robertDowneyJr, bradPitt, marlonBrando))));
        films.add(new Film("'Bajecznie zmyślony tytuł'", "drama", 1976, wesAnderson, new ArrayList<>(asList(angelinaJolie, hughJackman, harrisonFord))));
        films.add(new Film("'Takiego filmu też nie ma'", "drama", 1976, stanleyKubrick, new ArrayList<>(asList(robertDowneyJr, marlonBrando, salmaHayek))));
        films.add(new Film("'Nie znam się na filmach'", "SCI-FI", 2003, quentinTarantino, new ArrayList<>(asList(jimCarey, marlonBrando, salmaHayek))));
        films.add(new Film("'Wymyśliłam ten tytuł'", "comedy", 2003, quentinTarantino, new ArrayList<>(asList(jimCarey, angelinaJolie, salmaHayek))));

        Helpers.displayMenu();

        Scanner scanner = new Scanner(System.in);
        int menu;
        menu = scanner.nextInt();

        switch (menu) {
            case 1 -> Helpers.getFilmsByDateRange(films);
            case 2 -> Helpers.getRandomFilm(films);
            case 3 -> Helpers.getActorFilmography(films);
            case 4 -> {
                System.out.println("Program will ends.");
                System.exit(0);
            }
            default -> System.out.println(menu);
        }
    }
}