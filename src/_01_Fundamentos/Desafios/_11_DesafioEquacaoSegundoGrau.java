package _01_Fundamentos.Desafios;

import java.util.Scanner;

public class _11_DesafioEquacaoSegundoGrau {
  public static void main(String[] args) {
    // Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
    // utilizando a fórmula de Bhaskara. 
    // Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

    Scanner entrada = new Scanner(System.in);

    System.out.println("---- Equação do Segundo Grau ----");
    System.out.println("Insira os valores abaixo: ");
    
    System.out.print("a: ");
    int a = entrada.nextInt();
    
    System.out.print("b: ");
    int b = entrada.nextInt();

    System.out.print("c: ");
    int c = entrada.nextInt();

    double delta = Math.pow(b, 2) - 4 * a * c;
    double x1 = (-b + Math.sqrt(delta)) / 2 * a;
    double x2 = (-b - Math.sqrt(delta)) / 2 * a;

    System.out.printf("\nFormula: %dx² + %dx + %d = 0", a, b, c);
    System.out.printf("\n\nPrimeiro X: %.1f", x1);
    System.out.printf("\nSegundo  X: %.1f", x2);
    
    entrada.close();
    }
}
