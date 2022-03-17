package com.qa.LiskovExercise;

public class BedroomAdder {
	
	public void addBedroom(Apartment apartment) {
        apartment.setSquareFootage(apartment.getSquareFootage() + 40);

        if (!(apartment instanceof Studio)) {
            apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1);
        }
    }
}


