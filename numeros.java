import java.util.Scanner;

public class numeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[10];

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + ": ");
			valores[i] = entrada.nextInt();
		}

		int mayor = valores[0];
		int menor = valores[0];
		int posicionMayor = 1;
		int posicionMenor = 1;

		for (int i = 1; i < valores.length; i++) {
			if (valores[i] > mayor) {
				mayor = valores[i];
				posicionMayor = i + 1;
			}
			if (valores[i] < menor) {
				menor = valores[i];
				posicionMenor = i + 1;
			}
		}

		System.out.println("Mayor: " + mayor);
		System.out.println("Posicion del mayor: " + posicionMayor);
		System.out.println("Menor: " + menor);
		System.out.println("Posicion del menor: " + posicionMenor);

		entrada.close();
	}
}
