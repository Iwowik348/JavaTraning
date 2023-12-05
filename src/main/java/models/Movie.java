package models;

public class Movie {

    //składniki klasy
    private String title;
    private int rating;
    private char category;
    private double budget;
    private boolean isMovieProzed;


    public Movie(String title) {
        this.title = title;
    }
    //pola

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie() {
    }

    public Movie(String title, int rating, char category, double budget, boolean isMovieProzed) {
        this.title = title;
        this.rating = rating;
        this.category = category;
        this.budget = budget;
        this.isMovieProzed = isMovieProzed;
    }
    //konstruktory


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isMovieProzed() {
        return isMovieProzed;
    }

    public void setMovieProzed(boolean movieProzed) {
        isMovieProzed = movieProzed;
    }
}

    //metody

