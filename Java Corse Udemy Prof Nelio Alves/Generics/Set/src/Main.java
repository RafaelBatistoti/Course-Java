import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

//		HashSet não respeita a ordem dos elementos
//		Set<String> set = new HashSet<>();
		
//		TreeSet respeita a ordem dos elementos (Caso  sejam Strings)
//		Ele vai ordenar alfabeticamente
//		Set<String> set = new TreeSet<>();
		
//		LinkedHashSet  respeita a ordem dos elementos da forma que você inseriu
		Set<String> set = new LinkedHashSet<>();
		
		
		set.add("1 - Tablet");
		set.add("0 - TV");
		set.add("2 - Notebook");
		
//		set.remove("1 - Tablet"); Remove da lista
//		set.removeIf(x -> x.charAt(0) == '1'); Remove de acordo com um predicado
		
		System.out.println("Existe '2 - Notebook' na lista? " + set.contains("2 - Notebook"));
		System.out.println();
		
		int i = 0;
		
		for (String p : set) {
			System.out.println("Posição: " + i + " - " + p);
			i ++;
		}

	}

}
