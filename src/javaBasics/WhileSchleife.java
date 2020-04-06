package javaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileSchleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		String line = "";
		ArrayList<String> namen = new ArrayList<String>();

		while (!line.equals("x")) {
				line = Input.nextLine();
				namen.add(line);

			
		}

		for (int j = 0; j < namen.size() - 1; j++) {
			for (int i = 0; i < namen.size() - 1; ++i) {
				if (namen.get(i).compareTo(namen.get(i + 1)) > 0) {

					String temporary = namen.get(i);
					namen.set(i, namen.get(i + 1));
					namen.set(i + 1, temporary);
				}
			}
		}
		namen.remove("x");
		System.out.print(namen);
	}

	//
}
