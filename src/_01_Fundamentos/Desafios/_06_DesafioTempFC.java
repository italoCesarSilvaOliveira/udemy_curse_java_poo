package _01_Fundamentos.Desafios;

import java.util.Scanner;

public class _06_DesafioTempFC {
  public static void main(String[] args) {
    // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor em Fahrenheit: ");
    double tempFah = entrada.nextDouble();

    double tempCel = (tempFah - 32) / 1.8;
    System.out.printf("O Valor %f em celius é: %.2f C°", tempFah, tempCel);

    entrada.close();
  }
}
