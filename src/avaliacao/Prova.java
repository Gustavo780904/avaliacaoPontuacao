package avaliacao;
import java.util.Locale;
import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE ");
		System.out.println("-------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO ");
		System.out.println();
		
		int compra; 
		double ticket;
		
		System.out.print("Quantas compras o cliente fez no último ano? ");
		compra = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticket = sc.nextDouble();
		System.out.println();
		
		sc.close();
	}
}