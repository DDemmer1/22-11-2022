package de.demmer.dennis;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

//		int[] irgendeinArray = new int[150];
//		System.out.println(Arrays.toString(irgendeinArray));
//
//		
//		for (int i = 0; i < irgendeinArray.length; i++) {
//			irgendeinArray[i] = 42;
//		}
//
//		String schönerString = Arrays.toString(irgendeinArray);
//		System.out.println(schönerString);
//		

		
		boolean[] meinRückgabeWert = func1(5);
		System.out.println(Arrays.toString(meinRückgabeWert));
		
		
		int[] meinIntArray = func2(meinRückgabeWert);
		System.out.println(Arrays.toString(meinIntArray));
		


	}
	
	
	
	
	static boolean[] func1(int arg) {
		
		boolean[] result = new boolean[arg];
		
		for (int i = 1 ; i <= arg ; i++) {
			
			System.out.print(i + "      ");
			if(i % 2 == 1) {
				result[i-1] = true;
			}
			
		}
		
		System.out.println();
		
		
		return result;
		
	}
	
	
	
	
	static int[] func2(boolean[] booleanArray) {
		
		//Ermittlung der länge des int[]
		int anzahlTrue = 0;
		
		for (int i = 0; i < booleanArray.length; i++) {
		
			if(booleanArray[i] == true) {
				anzahlTrue = anzahlTrue +1 ;
			}
	
		}
	    // ----------------------
		
		
		int[] result = new int[anzahlTrue];
		

		int intArrayCounter = 0;
		
		for (int i = 0; i < booleanArray.length; i++) {
			
			if(booleanArray[i] == true) {
				result[intArrayCounter] = i + 1;
				intArrayCounter ++;
			}

		}
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
