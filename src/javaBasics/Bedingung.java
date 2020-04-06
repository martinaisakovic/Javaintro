package javaBasics;

public class Bedingung {

	public static void main(String[] args) {
		if (1 < 3) {
			System.out.println("1<3");
		}

		if (3 < 1) {
			System.out.println("3<1");
		}

		int zahlA;
		int zahlB;
		zahlA = 3;
		zahlB = 1;

		if (zahlA < zahlB) {
			System.out.println(zahlA + "<" + zahlB);
		} else {
			System.out.println(zahlA + ">" + zahlB);
		}

//Abfrage auf gleich ==
		if (zahlA == zahlB) {
		}
		;

//nicht gleich
		if (zahlA != zahlB) {
		}
		;
		if ("hans" == "hans") {
			System.out.print("HANS ");
		}

		String nameA = "hans";
		String nameB = "hans";

		if (nameA == nameB) {
			System.out.print("GET ");
		}

//alte Variante
		if ("hansi".contentEquals("hansi")) {
			System.out.println("SE FLAMMENWERFER");
		}

//Klammern
		if (0 < 1) {
			System.out.println("juhu");
			System.out.println("abcd");
		}
		
		//% gibt de Rest beim dividieren an.
		System.out.println(9%2);
		
//		if (9%3) {
//			System.out.println("Rest ist 0");
//			}
	}
}
