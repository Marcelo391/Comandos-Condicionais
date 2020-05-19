import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		double s_conta, s_salario, s_valor;
		int num1 = 15, num2 = 7;		
		
		System.out.println("Digite seu salário atual: ");
		s_valor = leitor.nextFloat();
		
		System.out.println();
		
		if ( s_valor >= 0 && s_valor <= 1000 ) {
			s_conta = num1 * s_valor/ 100;
			s_salario = s_valor + s_conta;
			
			System.out.println("Aumento percentual de 15% ");
			System.out.printf("Novo salário: R$%.2f", s_salario);}
		
		else if ( s_valor >= 1000.01 && s_valor <= 2500.00) {
				s_conta = num1 * s_valor/ 100;
				s_salario = s_valor + s_conta;	
			
				System.out.println("Aumento percentual de 15% ");
				System.out.printf("Novo salário: R$%.2f", s_salario);}
		
		else {
			System.out.println("Você não tem aumento, pois seu salário é acima de R$ 2500.00");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
