
package javaBasics;

public class Bubblesort {

	public static void main(String[] args) {
		int[] zahl = { 9, 5, 1, 4, 6, 3, 2, 8, 0 };
		for (int j = 0; j < zahl.length-1;j++) { 
			for (int i = 0; i < zahl.length-1; i++) {
				if (zahl[i] > zahl[i + 1]) { 
					int x = zahl[i];
					zahl[i] = zahl[i + 1];
					zahl[i + 1] = x;
				}
			}
		}
		
		System.out.println(zahl[0]); 
		System.out.println(zahl[1]);
		System.out.println(zahl[2]);
		System.out.println(zahl[3]);
		System.out.println(zahl[4]);
		System.out.println(zahl[5]); 
		System.out.println(zahl[6]);
		System.out.println(zahl[7]);
		System.out.println(zahl[8]);

	}

}
