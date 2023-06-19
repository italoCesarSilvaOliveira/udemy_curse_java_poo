package _02_EstruturasDeControle;

import java.util.Scanner;

public class _01_IF {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a média: ");
    double media = entrada.nextDouble();

    if (media <= 10 && media >= 7.0) {
      System.out.println("Aprovado!!");
    }

    if (media < 4.5 && media >= 4.5){
      System.out.println("Recuperação!!");
    }

    boolean criterioReprovacao = media < 4.5 && media >= 0; 
    if (criterioReprovacao){
      System.out.println("Reprovado!!");
    }

    entrada.close();
  }
}
