package application;

public class Main {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria","Marcos", "Mariano"};
		
		//For convencional
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------------------");
		
		//ForEach
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
