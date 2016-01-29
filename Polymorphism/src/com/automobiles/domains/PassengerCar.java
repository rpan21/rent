package com.automobiles.domains;
import com.automobiles.ifaces.*;

public class PassengerCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i20";
	}

}
