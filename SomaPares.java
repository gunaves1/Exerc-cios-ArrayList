package vetores;

import java.util.ArrayList;

public class SomaPares {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);

		for(int numero : numeros) {
			if(numero % 2 == 0) {
				soma = soma + numero;
			}
		}
		System.out.println(soma);
	}
}
