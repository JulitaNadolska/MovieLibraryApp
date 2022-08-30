package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Film {
    private String filmTitle;
    private String filmGenre;
    private int filmReleaseDate;
    private Director director;
    private List<Actor> actors;

    public String toString() {
        return filmTitle + " " + filmGenre + " " + filmReleaseDate + " " + director + " " + actors;
    }
}