package lab6;

import java.util.Arrays;

public class UsedCar {
    private String vin;
    private String make;
    private int year;
    private int mileage;
    private double price;
    UsedCar(String vin, String make, int year, int mileage, double price) throws UsedCarException{
        boolean validMake = Arrays.asList("Ford", "Honda", "Toyota", "Chrysler", "Other").contains(make);
        if(vin.length() != 4 || !validMake || year < 1997 || year > 2017 || mileage < 0 || price < 0){
            throw new UsedCarException(vin);
        }
        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString(){
        return "VIN: " + vin + ", Make: " + make + ", Year: " + year + ", Mileage: " + mileage + ", Price: $" + price;
    }
}
