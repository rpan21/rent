import java.util.Scanner;

import com.automobiles.domains.NewShowRoom;
import com.automobiles.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewShowRoom newShowRoom = new NewShowRoom();
		Automobile polyAuto=null;
		int key=1;
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("======MENU=========");
			System.out.println("1:Passenger Car\n2:Luxury Car\n3:Sports Car\n4:Sports Bike\n5:Exit");
			System.out.println("Enter your choice");
			key=s.nextInt();
			polyAuto=newShowRoom.getItem(key);
			if(polyAuto==null) continue;
			newShowRoom.printQuote(polyAuto);
		}
		
	}

}
