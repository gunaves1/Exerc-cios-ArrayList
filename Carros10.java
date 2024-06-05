package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Carros10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> carros = new ArrayList<String>();
		int a;
		carros.add("Fusca");
		carros.add("Monza");
		carros.add("Brasília");
		carros.add("Celta");
		carros.add("Chevette");
		carros.add("Corcel");
		carros.add("Kombi");
		carros.add("Opala");
		carros.add("Variant");
		carros.add("Fiat Uno");

		System.out.println(carros);

		System.out.println("Qual desses carros você gostaria de ver? Informe de 0 a 9: ");
		a = ler.nextInt();
		
		System.out.println(carros.get(a));
		ler.close();
	}

}
