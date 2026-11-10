package com.campusdual.encapsulation;

public class Vehicle {

    private String licensePlate;
    private String model;
    private String brand;
    private boolean available;
    public static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String licensePlate, String model, String brand) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.available = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void rentCar(){
        if (this.isAvailable()) {
            this.setAvailable(false);
            System.out.println("The vehicle with license plate" + this.licensePlate + "has been rented.");

        } else{
            System.out.println("The vehicle with license plate" + this.licensePlate + "is not available");

        }
    }

    public void returnCar() {
        if (!this.isAvailable()) { //esto es lo mismo que poner == false, con ! ponemos distinto de true que es el valor inicial, por ello estamos inicando false.
            System.out.println("The vehicle with license plate" + this.licensePlate + " has been returned and is available");
        } else {
            System.out.println("The vehicle with license plate" + this.licensePlate + " is already available");

        }
    }
        public String getDetails(){
            return this.getBrand()+" "+this.getModel()+"\n\tLicense Plate: "+this.getLicensePlate() + "\n\tAvailable: "+(this.isAvailable() ? "Yes" : "No");


        }

}
