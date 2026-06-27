package org.example.springbootcountrygenerator.jokes;

public class Joke {

    private String value;

    private int rating;

    public Joke(){}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
