package com.splunk;

import java.util.List;

public class Snack {

    private String name;
    private int calories;
    private List<String> ingredients;
    private int rating;

    public Snack() {

    }

    public Snack(String name, int calories, List<String> ingredients, int rating) {
        this.name = name;
        this.calories = calories;
        this.ingredients = ingredients;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", ingredients=" + ingredients +
                ", rating=" + rating +
                '}';
    }
}
