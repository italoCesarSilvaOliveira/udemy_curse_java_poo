package _01_Fundamentos.Desafios;

import java.util.Scanner;

public class _07_DesafioTempCF {
  public static void main(String[] args) {
    // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
    // F = (C x 1.8) + 32;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor em Celsius: ");
    double tempCel = entrada.nextDouble();
    
    System.out.printf("O valor %.2f ºC é %.2f ºF", tempCel, (tempCel * 1.8) + 32);

    entrada.close();
  }
}
