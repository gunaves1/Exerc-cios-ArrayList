package vetores;

import java.util.ArrayList;
import java.util.Scanner
;public class Açai {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> ingredientes = new ArrayList<String>();
		
		ingredientes.add("Banana");
		ingredientes.add("Granola");
		ingredientes.add("Leite Condensado");
		ingredientes.add("Leite em pó");
		ingredientes.add("Chocolate");
		
		System.out.println(ingredientes);
		
		System.out.println("Deseja adicionar[1] ou remover[2] algum ingrediente? Caso não queira digite 3.");
		int a = ler.nextInt();
		if(a == 1) {
			System.out.println("O que gostaria de adicionar?");
			ingredientes.add(ler.next());
			System.out.println("Ingredientes do pedido: ");
			System.out.println(ingredientes);
		}
		else if(a == 2) {
			System.out.println("O que deseja remover [0-4]");
			ingredientes.remove(ler.nextInt());
			System.out.println("Ingredientes do pedido: ");
			System.out.println(ingredientes);
		}
		else {
			System.out.println(ingredientes);
		}
		ler.close();
	}

}
