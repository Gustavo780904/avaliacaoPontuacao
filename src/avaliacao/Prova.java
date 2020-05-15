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
		
		int compra, atraso; 
		double ticket;
		char formaPag;
		
	
		System.out.print("Quantas compras o cliente fez no último ano? ");
		compra = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticket = sc.nextDouble();
		System.out.println();
		
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		formaPag = sc.next().charAt(0);
		System.out.println();
		
		
		
		sc.close();
	}
}