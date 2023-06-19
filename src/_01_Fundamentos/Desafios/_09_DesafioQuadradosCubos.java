package _01_Fundamentos.Desafios;

import java.util.Scanner;

public class _09_DesafioQuadradosCubos {
  public static void main(String[] args) {
    // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escreva um Valor: ");
    int valor = entrada.nextInt();

    double quadradoValor = Math.pow(valor, 2);
    double cuboValor = Math.pow(valor, 3);

    System.out.printf("Valor ao Quadrado: %.1f   |   Valor ao Cubo: %.1f", quadradoValor, cuboValor);

    entrada.close();
  }
}
