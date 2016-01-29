package com.automobiles.domains;
import com.automobiles.ifaces.*;

public class LuxuryCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10000000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW-7";
	}
	
	

}
