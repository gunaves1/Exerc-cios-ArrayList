package vetores;

import java.util.ArrayList;

public class SomaNegativos {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		numeros.add(-12);
		numeros.add(10);
		numeros.add(-5);
		numeros.add(-8);
		numeros.add(7);
		numeros.add(13);
		
		for(int numero : numeros) {
			if(numero < 0) {
				soma = soma + numero;
			}
		}
		System.out.println(soma);
	}

}
