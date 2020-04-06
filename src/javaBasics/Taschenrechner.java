package javaBasics;

import java.util.Scanner;

public class Taschenrechner {
	int x;
	int y;

	public static void main(String[] args) {
		System.out.println("Wert 1:");
		Scanner xe = new Scanner(System.in);
		float x = xe.nextFloat();

		System.out.println("Wert 2:");
		Scanner ye = new Scanner(System.in);
		float y = ye.nextFloat();

		System.out.println("Was wollen sie machen?");
		System.out.println("[1=Addieren]");
		System.out.println("[2=Subtrahieren]");
		System.out.println("[3=Multiplizieren]");
		System.out.println("[4=Dividieren]");
		Scanner infe = new Scanner(System.in);
		float inf = infe.nextFloat();

		if (inf == 1) {
			float z = x + y;
			System.out.println(z);
		}
		if (inf == 2) {
			float z = x - y;
			System.out.println(z);
		}
		if (inf == 3) {
			float z = x * y;
			System.out.println(z);
		}
		if (inf == 4) {
			float z = x / y;
			System.out.println(z);
		}
//
	}
}
