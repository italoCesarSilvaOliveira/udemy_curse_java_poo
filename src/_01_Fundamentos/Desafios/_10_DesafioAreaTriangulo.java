package _01_Fundamentos.Desafios;

import java.util.Scanner;

public class _10_DesafioAreaTriangulo {
  public static void main(String[] args) {
    // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
    // A = b * h

    Scanner entrada = new Scanner(System.in);

    System.out.println("--- Área de um triângulo ---\n");
    System.out.print("[base](cm): ");
    double base = entrada.nextDouble();

    System.out.print("[altura](cm): ");
    double altura = entrada.nextDouble();

    double resultado = (base * altura) / 2;

    System.out.printf("Área do Triângulo: %.1f cm²", resultado);

    entrada.close();
  }
}
