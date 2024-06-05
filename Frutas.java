package vetores;

import java.util.ArrayList;

public class Frutas {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<String>();
		frutas.add("Laranja");
		frutas.add("Uva");
		frutas.add("Melancia");
		frutas.add("Banana");
		frutas.add("Abacaxi");
		frutas.add("Melão");
		frutas.add("Amora");
		frutas.add("Morango");
		frutas.add("Mamão");
		frutas.add("Abacate");
		
		System.out.println(frutas);
		
		frutas.remove(0);
		frutas.remove(1);
		frutas.remove(2);
		frutas.remove(3);
		frutas.remove(4);
		
		System.out.println(frutas);
		System.out.println(frutas.size());

	}

}
