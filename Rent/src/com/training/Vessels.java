package com.training;

import java.util.Scanner;

public class Vessels extends item {

	public int getSerialId()
	{
		int key;
		Scanner sc= new Scanner(System.in);
		System.out.println("1:Spoon\n2:Plates\n3:Glass");
		System.out.println("Enter your choice");
		key=sc.nextInt();
		switch (key)
		{
			case 1: return 4001;
			case 2: return 4002; 
			case 3: return 4003;
			default: return 0;
		}
	}
	public double getRent(int id)
	{
		switch (id)
		{
			case 4001: return 1000;
			case 4002: return 800;
			case 4003: return 1200;
			default : return 0;
		}
	}
	

}
