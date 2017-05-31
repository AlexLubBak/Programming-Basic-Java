/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Car {

    private String brand = null;
    private Double price;
    private int yearOfFirstRegistration;

    public Car() {

    }

    public Car(String newBrand, double newPrice, int newYearOfFirstRegistration) {
        setBrand(newBrand);
        setPrice(newPrice);
        setyearOfFirstRegistration(newYearOfFirstRegistration);

    }

    public String getBrand() {
        return brand;

    }

    public void setBrand(String name) {
        brand = name;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {

        if (newPrice > 0) {
            price = newPrice;
        } else {
            System.err.println("Incorect data! Please enter a positive number!");
        }

    }

    public int getYearOfFirstRegistration() {
        return yearOfFirstRegistration;
    }

    public void setyearOfFirstRegistration(int newyearOfFirstRegistration) {
        if (newyearOfFirstRegistration > 1900) {
            yearOfFirstRegistration = newyearOfFirstRegistration;
        } else {
            System.err.println("Incorrect data! Please enter an year > 1900!");
        }
    }

    public void displaySpecifications() {
        System.out.println("The specifications are:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: " + getPrice());
        System.out.println("Year of " + getYearOfFirstRegistration());

    }
}
