import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int optar = 0;
		
		while (optar == 0) {
			System.out.println("Selecione seu Lanche!");
			System.out.println("[1] - Sanduíches");
			System.out.println("[2] - Massas");
			System.out.println("[3] - Bolos");
			
			optar = scan.nextInt();
			
			if (optar == 1) {
				sanduiches();
			} else if (optar == 2) {
				massas();
			} else if (optar ==3) {
				bolos();
			}
		}
		
	}

}
