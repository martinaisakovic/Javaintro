package javaBasics;

public class VariablenBasics {

	public static void main(String[] args) {
		//wahr/falsch
		//boolean 1bit
		boolean wahr_oder_falsch;
		
		wahr_oder_falsch = true;
		System.out.println(wahr_oder_falsch);

		wahr_oder_falsch = false;
		System.out.println(wahr_oder_falsch);
		System.out.println(" ");
		
		//byte
		byte zahl=1;
		System.out.println(zahl);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(" ");
		
		//short - 2byte
		short ganz_kleine_Zahl = 120;
		System.out.println(ganz_kleine_Zahl);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(" ");
		
		//int - 4 byte
		int kleine_Zahl = 123456;
		System.out.println(kleine_Zahl);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(" ");
		
		//long
		int grosse_Zahl =1234567890;
		System.out.println(grosse_Zahl);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(" ");
		
		//float
		float kleine_komma_zahl = 123.456F;		//F.....Float
		System.out.println(kleine_komma_zahl);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(" ");
		
		//double
		double grosse_komma_zahl = 123.456F;
		System.out.println(grosse_komma_zahl);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(" ");
		//
		
		//char
		char ein_zeichen = 'a';
		System.out.println(ein_zeichen);
		//char zwei_zeichen='ab'; geht nicht!
		
		//string
		String text ="abcdefg";
		System.out.println(text); 
		
		
		
		
	}

}
