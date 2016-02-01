package com.training;

import java.util.Scanner;

public class Fan extends item {

	public int getSerialId()
	{
		int key;
		Scanner sc= new Scanner(System.in);
		System.out.println("1:Hanging\n2:Table\n3:Standing");
		System.out.println("Enter your choice");
		key=sc.nextInt();
		switch (key) 
		{
			case 1: return 1001;
			case 2: return 1002; 
			case 3: return 1003;
			default: return 0;
		}
	}
	public double getRent(int id)
	{
		switch (id)
		{
			case 1001: return 1000;
			case 1002: return 800;
			case 1003: return 1200;
			default : return 0;
		}
	}
	
}
