package lista_1;

import java.util.Scanner;

public class Exe_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int idadeAno, idadeDias, anoDias = 365;
		
		System.out.println("Quantos anos você tem?");
		idadeAno = s.nextInt();
		
		idadeDias = idadeAno * anoDias;
		
		System.out.println("Você possui " + idadeDias + " dias de vida");
	}
}
/*
	4. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
	ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
	com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
	DIAS
*/