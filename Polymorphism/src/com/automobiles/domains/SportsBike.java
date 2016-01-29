package com.automobiles.domains;

import com.automobiles.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Green";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "HayaBuza";
	}

}
