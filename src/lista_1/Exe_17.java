package lista_1;

import java.util.Scanner;

public class Exe_17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double tempCelsius, tempFahrenheit;
		
		System.out.println("Informe a temperatura em Celsius");
		tempCelsius = s.nextDouble();
		
		tempFahrenheit = (tempCelsius * 1.8) + 32;
		
		System.out.println("Temperatura em Fahrenheit: "+ tempFahrenheit + "° F");
	}
}
/*
	17. Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um
	algoritmo para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise como fazer este
	tipo de conversão).
*/