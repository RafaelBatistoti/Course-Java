
public class Formating {

	public static void main(String[] args) {

		String nome = " Rafael Luiz Batistoti";

		String s1 = nome.toLowerCase();
		String s2 = nome.toUpperCase();
		String s3 = nome.trim();
		String s4 = nome.substring(2);
		String s10 = nome.substring(2, 9);
		String s5 = nome.replace('a', 'x');
		int s6 = nome.indexOf("el");
		int s7 = nome.lastIndexOf("el");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s10);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);

	}

}
