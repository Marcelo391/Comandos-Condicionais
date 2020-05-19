import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.println("Digite um valor para cada lado de um triângulo: ");
		
		System.out.println();
		System.out.print("Digite o primeiro valor: ");
		valor1 = leitor.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = leitor.nextInt();
		System.out.print("Digite o terceiro valor: ");
		valor3 = leitor.nextInt();
		System.out.println();
		
		if ( valor1 == valor2 && valor1 == valor3 ){
			System.out.println("O triângulo é Equilátero");}
		
		else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
			System.out.println("O valor do triângulo é Isósceles");}
		
		else if (valor1!=valor2 && valor2 != valor3) {
			System.out.println("O valor do triângulo é Escaleno");}
		
		
		
		
		
		
		
		
		

	}

}
