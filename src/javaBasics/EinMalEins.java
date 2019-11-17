class KleinesEinMalEins {
	public static void main (String args[]){
		int x = 1;
		
		for(int i=1;i<=10;i = i + 1) { 
			for (int j=1;j<10;j = j + 1)
				System.out.println(i + "x" + j + "=" + i*j); 
		}
	}
}