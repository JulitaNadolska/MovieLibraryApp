package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Helpers {
    public static void displayMenu() {
        printMessage("1 - Enter two dates to display the names of videos recorded between those dates");
        printMessage("2 - Display all information about a random movie");
        printMessage("3 - Enter the actor's name to display the names of the movies he played in");
        printMessage("4 - Program end");
    }

    public static void getRandomFilm(@NotNull List<Film> films) {
        int randomFilm = new Random().nextInt(films.size());
        printMessage("title: " + films.get(randomFilm).getFilmTitle());
        printMessage("genre: " + films.get(randomFilm).getFilmGenre());
        System.out.println("release date: " + films.get(randomFilm).getFilmReleaseDate());
        printMessage("director: " + films.get(randomFilm).getDirector().getDirectorFirstName() + " " + films.get(randomFilm).getDirector().getDirectorLastName());
        for (Actor actor : films.get(randomFilm).getActors()) {
            printMessage("actors: " + actor.getActorFirstName() + " " + actor.getActorLastName());
        }
    }

    public static void getFilmsByDateRange(@NotNull List<Film> films) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Provide date from: ");
        int dateRangeFrom = scanner.nextInt();
        printMessage("Provide tdate to: ");
        int dateRangeTo = scanner.nextInt();

        for (Film f : films) {
            if (f.getFilmReleaseDate() > dateRangeFrom && f.getFilmReleaseDate() < dateRangeTo) {
                printMessage("title: " + f.getFilmTitle() + ", \r\n" +
                        "director: " + f.getDirector().getDirectorFirstName() + " " + f.getDirector().getDirectorLastName() + ", \r\n" +
                        "genre: " + " " + f.getFilmGenre() + ", \r\n" +
                        "release date: " + f.getFilmReleaseDate());
                for (Actor actor : f.getActors()) {
                    printMessage("actor: " + actor.getActorFirstName() + " " + actor.getActorLastName());
                }
                System.out.println();
            }
        }
    }

    public static void getActorFilmography(@NotNull List<Film> films) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter actor first name: ");
        String formActorFirstName = scanner.next();
        printMessage("Enter actor last name: ");
        String formActorLastName = scanner.next();

        for (Film f : films) {
            for (int i = 0; i < films.get(i).getActors().size(); i++) {
                if (f.getActors().get(i).getActorFirstName().equals(formActorFirstName) && f.getActors().get(i).getActorLastName().equals(formActorLastName)) {
                    printMessage("title: " + f.getFilmTitle() + "\r\n" +
                            "director: " + f.getDirector().getDirectorFirstName() + " " + f.getDirector().getDirectorLastName() + "\r\n" +
                            "genre: " + " " + f.getFilmGenre() + " \r\n" +
                            "release date: " + f.getFilmReleaseDate() + "\r\n");
                }
            }
        }
    }

    private static void printMessage(String stringToPrint) {
        System.out.println(stringToPrint);
    }
}