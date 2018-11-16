package com.catzen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_10");
        System.out.println("Task_1_of_homework_number_10");
        Scanner w = new Scanner(System.in);
        int arrayNumber;
        System.out.println("Enter quantity of fruits");
        arrayNumber = w.nextInt();
        System.out.println("Quantity of fruits is " + arrayNumber);
        double sumFruitsPrice = 0;
        for (int i = 0; i < arrayNumber; i++) {
            Fruit fruit = new Fruit();
            enterFruit(fruit);
            System.out.println(fruit);
            System.out.println("Final price of " + fruit.getFruitColor() + "_" + fruit.getFruitName() + " is " + fruit.getFruitFinalPrice());
            sumFruitsPrice = sumFruitsPrice + fruit.getFruitFinalPrice();
        }
        System.out.println("Final check price is " + sumFruitsPrice);
        System.out.println("Task_2_of_homework_number_10");
        int numberPerson;
        System.out.println("Enter quantity of persons");
        numberPerson = w.nextInt();
        System.out.println("Quantity of persons is " + numberPerson);
        Person[] arrayPerson = new Person[numberPerson];
        for (int i = 0; i < arrayPerson.length; i++) {
            arrayPerson[i] = enterPerson();
        }
        for (int i = 0; i < arrayPerson.length; i++) {
            System.out.println(arrayPerson[i]);
        }
    }

    public static void enterFruit(Fruit fruit) {
        Scanner s = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        String fruitName;
        String fruitColor;
        double fruitWeight;
        double fruitPricePerKilo;
        System.out.println("Enter fruit type");
        fruitName = s.nextLine();
        fruit.setFruitName(fruitName);
        System.out.println("Enter fruit color");
        fruitColor = s.nextLine();
        fruit.setFruitColor(fruitColor);
        System.out.println("Enter fruit weight");
        fruitWeight = w.nextDouble();
        fruit.setFruitWeight(fruitWeight);
        System.out.println("Enter fruit price per kilo");
        fruitPricePerKilo = w.nextDouble();
        fruit.setFruitPricePerKilo(fruitPricePerKilo);
    }

    public static Person enterPerson() {
        String[] arrayPersonName = {"Oleg", "Miguel", "Fridrich", "Maximilian", "Alex", "Hans", "Adolf", "Muller"};
        String[] arrayPersonSurname = {"Olegin", "Babushkin", "Dmotriy", "Ordjonikidze", "Kirow", "Dzerjinskiy", "Chapaev"};
        Random r = new Random();
        String personName = arrayPersonName[r.nextInt(arrayPersonName.length)];
        String personSurname = arrayPersonSurname[r.nextInt(arrayPersonSurname.length)];
        Person person = new Person(personName, personSurname);
        int personAge;
        int personWeight;
        int personRise;
        personAge = r.nextInt(60) + 20;
        personWeight = r.nextInt(60) + 60;
        personRise = r.nextInt(75) + 60;
        person.setPersonAge(personAge);
        person.setPersonWeight(personWeight);
        person.setPersonRise(personRise);
        return person;
    }
}
