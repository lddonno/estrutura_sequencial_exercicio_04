package estrutura_sequencial_exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func, nhoras;
		double vhora, salario;
		
		func = sc.nextInt();
		nhoras = sc.nextInt();
		vhora = sc.nextDouble();
		
		salario = nhoras * vhora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", func, salario);
			
		sc.close();
		
	}

}
