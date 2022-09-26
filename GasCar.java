package edu.sdccd.cisc191;

public class GasCar extends Car {


    public GasCar(String manufacturerName, int numMiles, int price, int numSeats, Option[] option, int numDoors){
        super(manufacturerName, numMiles, price, numSeats, option, numDoors);
    }
    public int getNumberOfDoors() {
        return numDoors;
    }

}