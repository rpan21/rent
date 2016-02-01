package com.training;
//caps
public abstract class item {
	double calcRent(int days,double rent){
		return rent*days;
	}
	public abstract int getSerialId();
	public abstract double getRent(int id);
}
