package com.catzen;

public class Fruit {
    private String fruitName;
    private String fruitColor;
    private double fruitWeight;
    private double fruitPricePerKilo;

    public Fruit() {
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public void setFruitWeight(double fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public void setFruitPricePerKilo(double fruitPricePerKilo) {
        this.fruitPricePerKilo = fruitPricePerKilo;
    }

    public double getFruitFinalPrice() {
        return fruitWeight * fruitPricePerKilo;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                ", fruitWeight=" + fruitWeight +
                ", fruitPricePerKilo=" + fruitPricePerKilo +
                '}';
    }
}
