package com.automobiles.domains;

import com.automobiles.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {
public Automobile getItem(int key){
		
		switch (key) {
		
			case 4: return new SportsBike();
			
			case 5: System.out.println("Thank You.... Visit Again"); 
					System.exit(0);

			default: return super.getItem(key);
		}
	}
}
