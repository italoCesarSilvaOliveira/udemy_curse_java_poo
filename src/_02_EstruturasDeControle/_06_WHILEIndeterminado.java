package _02_EstruturasDeControle;

import java.util.Scanner;

public class _06_WHILEIndeterminado {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    String contador = "";
    while (!contador.equalsIgnoreCase("sair")) {
      System.out.print("Digite uma palavra: ");
      contador = entrada.next();
    } 
    
    entrada.close();
  }
}
