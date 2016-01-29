package com.automobiles.domains;
import com.automobiles.ifaces.*;

public class SportsCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 2000000000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Ferrari";
	}

	
}
