package de.demmer.dennis;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		
		int[] irgendeinArray = {5,6,7,5,7,8,8,0};
		
		
		//Gibt nur einen hashwert aus
		System.out.println("Nicht so gut lesbar: " + irgendeinArray);
		
		//gibt den tatsächlichen Inhalt des Arrays aus
		System.out.println("Gut lesbares Array: " + Arrays.toString(irgendeinArray));
	

	}
	
	
	
}
