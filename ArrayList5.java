package vetores;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		for(int numero : numeros) {
			soma = soma + numero;
		}
		System.out.println(soma);
		
	}

}
