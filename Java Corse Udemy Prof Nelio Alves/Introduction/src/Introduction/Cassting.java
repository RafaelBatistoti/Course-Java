package Introduction;

public class Cassting {

	public static void main(String[] args) {
		
		//See how Casting works
		
		int a,b;
		double resultado;
		
		a =5;
		b =2;
		
		resultado = (double) a/b; 	//The casting is added because of the values "a" and "b" are int type
									//Without the casting the result will be "2.0"
		
		System.out.println(resultado);

	}

}
