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
		
		int scoreInad = 0, compra, atraso, scoreCompra; 
		double ticket, volumeCompra;
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
		
		volumeCompra = compra * ticket;
		
		if (volumeCompra == 0.0) {
			scoreCompra = 0;
		} else if (volumeCompra <= 3000.0) {
			if (compra == 1) {
				scoreCompra = 20;
			} else {
				scoreCompra = 40;
			}
		} else {
			scoreCompra = 60;
		}
		System.out.println("Score de volume de compras = " + scoreCompra + " pontos");
		System.out.println();
				
		if (atraso > 1 || compra == 0) {
				scoreInad = 0;
		} else if (compra > 0 && atraso == 1) {
				scoreInad = 15;
		} else if (compra > 0 && atraso == 0) {
				scoreInad = 30;
		}
				
		System.out.println("Score de inadimplência = " + scoreInad + " pontos");
		
		sc.close();
	}
}