package com.automobiles.domains;

import com.automobiles.ifaces.Automobile;

public class ShowRoom {

	public Automobile getItem(int key){
		
		switch (key) {
		
			case 1: return new PassengerCar();
		
			case 2: return new LuxuryCar();
		
			case 3: return new SportsCar();
			
			case 4: System.out.println("Thank You.... Visit Again"); 
					System.exit(0);

			default: System.out.println("Invalid Choice");
					 return null;
		}
	}
	/**
	 * 
	 * @param polyAuto takes the object of type Automobiles
	 * 
	 * Method Prints the Quotation of the Product Selected
	 */
	public void printQuote(Automobile polyAuto){
		
		System.out.println("*****************   Quotation   *******************");
		System.out.println("Model := "+polyAuto.getModel());
		System.out.println("Color := "+polyAuto.getColor());
		System.out.println("Price := "+polyAuto.getPrice());
	}
}
