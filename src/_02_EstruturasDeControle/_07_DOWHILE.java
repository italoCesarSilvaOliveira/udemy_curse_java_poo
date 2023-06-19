package _02_EstruturasDeControle;

import java.util.Scanner;

public class _07_DOWHILE {
  public static void main(String[] args){
    
    Scanner entrada = new Scanner(System.in);
    String valor = "";

    do {
      System.out.println("Você precisa falar as palavras mágicas...");
      System.out.printf("Quer sair? : ");
      valor = entrada.nextLine();
    } while (!valor.equalsIgnoreCase("por favor"));

    System.out.println("Obrigado!");
    entrada.close();
  }
}
