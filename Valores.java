package vetores;

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int[5];
		int soma = 0;
		for (int i = 0; i<5; i++) {
			System.out.println("Informe um valor: ");
			a[i] = ler.nextInt();
			soma += a[i];
		}
		if (soma > 30) {
			System.out.println("O valor da soma é " + soma);
		}
		else {
			System.out.println("O valor não é maior que 30");
		}
		ler.close();
	}
}
