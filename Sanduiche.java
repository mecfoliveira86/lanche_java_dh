import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche extends Lanche{
	Scanner scan = new Scanner(System.in);
	String opcao;
	int counter = 0;
	
	setTempo(15);
	setPreco(15);
	
	private List<String> ingredientes = new ArrayList<>();
	
	public void selecionar() {
		System.out.println("Selecione 10 ingredientes para seu sanduiche!");
		while (ingredientes.size() != 10) {
			System.out.println("Você tem" + (10 - counter) + "para selecionar!");
			System.out.println("Suas opções são:");
			System.out.println("[1] - Pão tradicional");
			System.out.println("[2] - Pão com queijo parmesão");
			System.out.println("[3] - Hamburguer bovino");
			System.out.println("[4] - Hamburguer vegetariano");
			System.out.println("[5] - Tomate");
			System.out.println("[6] - Alface");
			System.out.println("[7] - Cebola");
			System.out.println("[8] - Cheddar");
			System.out.println("[9] - Maionese");
			System.out.println("[10] - Molho Especial da Casa");
			opcao = scan.next();
			ingredientes.add(opcao);
			counter = counter + 1;
		}
	}
}
