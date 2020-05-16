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
		
		int compra, atraso, scoreCompra, scoreInad = 0, scorePag = 0, scoreTotal; 
		double ticket, volumeCompra;
		char formaPag;
		String classFinal;
	
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
		} else {
			scoreInad = 0;
		}
				
		if (compra == 0 && formaPag == 'D') {
			scorePag = 5;
		} else if (compra > 0 && formaPag == 'C') {
			scorePag = 10;
		} else {
			scorePag = 0;
		}
				
		System.out.println("Score de inadimplência = " + scoreInad + " pontos");
		System.out.println("Score de forma de pagamento = " + scorePag + " pontos");
		System.out.println();
			
		scoreTotal = scoreCompra + scoreInad + scorePag;
		
		if (scoreTotal > 0 && scoreTotal <= 25) {
			classFinal = "BRONZE";
		} else if (scoreTotal <= 75) {
			classFinal = "PRATA";
		} else {
			classFinal = "OURO";
		}
		
		System.out.println("Classificação final = CLIENTE " + classFinal);
		
		
		sc.close();
	}
}