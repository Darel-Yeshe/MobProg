package Modul;

import java.util.ArrayList;

public class Product {
    String name;
    String imageFileName;
    String origin;
    String foodType;
    String ingredients;
    String hourToMake;
    String Step;
    int likes;

    public Product(String name, String imageFileName, String origin, String foodType, String ingredients, String hourToMake, String step, Integer likes) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.origin = origin;
        this.foodType = foodType;
        this.ingredients = ingredients;
        this.hourToMake = hourToMake;
        Step = step;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getHourToMake() {
        return hourToMake;
    }

    public void setHourToMake(String hourToMake) {
        this.hourToMake = hourToMake;
    }

    public String getStep() {
        return Step;
    }

    public void setStep(String step) {
        Step = step;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
