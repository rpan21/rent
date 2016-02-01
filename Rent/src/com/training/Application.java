package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int key;
		int id,days,q;
		double rent,total=0,r;
		String Report="*******************Chennai Rental*************************\n";
		Report+="====================================================================\n";
		Report+="\tItem\t\t Quantity\t days\t Rent \t Total Price\n";
		Report+="====================================================================\n";
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Welcome to Chennai Rental");
			System.out.println("1:Fan\n2:Air Conditioner\n3:Furniture\n4:Vessels\n5:Exit");
			System.out.println("Enter your choice");
			key=sc.nextInt();
			if(key==5) 
			{
				System.out.println(Report);
				System.out.println("=================================================Total Amt: "+total);
				System.exit(0);
			}
			
			switch (key) 
			{
				case 1: Fan f=new Fan();
						id=f.getSerialId();
						r=f.getRent(id);
						System.out.println("Enter no of days");
						days=sc.nextInt();
						System.out.println("Enter Quantity");
						q=sc.nextInt();
						rent=f.calcRent(days, r);
						total+=rent*q;
						Report+="Fan-"+id+"\t\t\t"+q+"\t"+days+"\t"+rent/days+"\t"+rent*q+"\n";
						break;
				case 2: AirConditioner ac=new AirConditioner();
						id=ac.getSerialId();
						r=ac.getRent(id);
						System.out.println("Enter no of days");
						days=sc.nextInt();
						System.out.println("Enter Quantity");
						q=sc.nextInt();
						rent=ac.calcRent(days, r);
						total+=rent*q;
						Report+="AC-"+id+"\t\t\t\t"+q+"\t"+days+"\t"+rent/days+"\t"+rent*q+"\n";
						break;
				case 3: furniture fur= new furniture();
						id=fur.getSerialId();
						r=fur.getRent(id);
						System.out.println("Enter no of days");
						days=sc.nextInt();
						System.out.println("Enter Quantity");
						q=sc.nextInt();
						rent=fur.calcRent(days, r);
						total+=rent*q;
						Report+="Furniture-"+id+"\t\t\t"+q+"\t"+days+"\t"+rent/days+"\t"+rent*q+"\n";
						break;
				case 4: Vessels v=new Vessels();
						id=v.getSerialId();
						r=v.getRent(id);
						System.out.println("Enter no of days");
						days=sc.nextInt();
						System.out.println("Enter Quantity");
						q=sc.nextInt();
						rent=v.calcRent(days, r);
						total+=rent*q;
						Report+="Vessel-"+id+"\t\t\t"+q+"\t"+days+"\t"+rent/days+"\t"+rent*q+"\n";
						break;
				default:System.out.println("Invalid Choice");
						break;
			}
		}
	}

}
