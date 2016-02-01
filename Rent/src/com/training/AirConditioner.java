package com.training;

import java.util.Scanner;

public class AirConditioner extends item {

	public int getSerialId()
	{
		int key;
		Scanner sc= new Scanner(System.in);
		System.out.println("1:Window\n2:Standing\n");
		System.out.println("Enter your choice");
		key=sc.nextInt();
		switch (key) 
		{
			case 1: return 2001;
			case 2: return 2002; 
			default: return 0;
		}
	}
	public double getRent(int id)
	{
		switch (id)
		{
			case 2001: return 3000;
			case 2002: return 4500;
			default : return 0;
		}
	}
}
