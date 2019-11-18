package javaBasics;

public class Bedigung {

	public static void main(String[] args) {

		if (1 < 3) {
			System.out.println("1 ist kleiner als 3");
		}

		if (3 < 1) {
			System.out.println("3 ist kleiner als 1");

		}

		int zahlA;
		int zahlB;

		zahlA = 3;
		zahlB = 1;

		if (zahlA < zahlB) {
			System.out.println(zahlA + "ist kleiner als" + zahlB);
		} else {
			System.out.println(zahlA + "ist nicht kleiner als" + zahlB);
		}

		if (zahlA == zahlB) {

		}

		if (zahlA != zahlB) {

		}

		if ("hans" == "hans") {
			System.out.println("Hans");
		}
		String nameA = "hans";
		String nameB = "hans";

		if (nameA == nameB) {
			System.out.println(nameA);
		}
		if ("hansi".contentEquals("hansi")) {
			System.out.println("hansi");
		}

		if (0 < 1) {
			System.out.println("juhu");
		System.out.println("abc");
		}
		
		System.out.println (9 % 2);
		//if (9 % 3) {
			//System.out.println("Rest ist 0");
		//}
		
		

	}
}
