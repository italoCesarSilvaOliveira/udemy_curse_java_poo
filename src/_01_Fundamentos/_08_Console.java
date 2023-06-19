package _01_Fundamentos;

import java.util.Scanner;

public class _08_Console {
  public static void main(String[] args) {
    System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
    System.out.printf("Salário: %.1f \n", 1234.5678);
    System.out.printf("Nome: %s%n", "João");

    // Objeto responsável por deixar o usuário entrar com dados pelo teclado
    Scanner entrada = new Scanner(System.in);

    System.out.print("\n\nDigite o seu Nome: ");
    String nome = entrada.nextLine();

    System.out.print("Digite o seu sobrenome: ");
    String sobrenome = entrada.nextLine();

    System.out.print("Digite a sua idade: ");
    int idade = entrada.nextInt();

    System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

    entrada.close(); // Fechamento da Objeto

  }
}
