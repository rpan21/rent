package com.training;

import java.util.Scanner;

public class furniture extends item {

	public int getSerialId()
	{
		int key;
		Scanner sc= new Scanner(System.in);
		System.out.println("1:chair\n2:Table\n3:Cot");
		System.out.println("Enter your choice");
		key=sc.nextInt();
		switch (key) 
		{
			case 1: return 3001;
			case 2: return 3002; 
			case 3: return 3003;
			default: return 0;
		}
	}
	public double getRent(int id)
	{
		switch (id)
		{
			case 3001: return 100;
			case 3002: return 150;
			case 3003: return 250;
			default : return 0;
		}
	}
	

}
