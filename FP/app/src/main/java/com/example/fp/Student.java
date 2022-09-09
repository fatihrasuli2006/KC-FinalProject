package com.example.fp;

public class Student {
    private String foodName;
    private String foodsDiscreption;
    private int foodtphoto;

    public Student(String foodName, String foodsDiscreption, int foodtphoto) {
        this.foodName = foodName;
        this.foodsDiscreption = foodsDiscreption;
        this.foodtphoto = foodtphoto;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodsDiscreption() {
        return foodsDiscreption;
    }

    public void setFoodsDiscreption(String foodsDiscreption) {
        this.foodsDiscreption = foodsDiscreption;
    }

    public int getFoodtphoto() {
        return foodtphoto;
    }

    public void setFoodtphoto(int foodtphoto) {
        this.foodtphoto = foodtphoto;
    }
}
