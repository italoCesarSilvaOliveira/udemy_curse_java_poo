package _02_EstruturasDeControle.Desafios;

import java.util.Scanner;

public class _02_DesafioWHILE_NotasAlunos {
  public static void main(String[] args) {
    /*
     * - O objetivo é inserir uma quantidade de notas de alunos.
     * - O usuário não poderá escolher a quantidade de notas inicialmente,
     * ele insere e decide quando o programa deve parar.
     * - Só poderar inserir dentro da variável se a nota for válida, ou seja,
     * notas de 0 a 10.
     * - A cada nota inserida, será acrescentada em uma variável total.
     * - Caso o usuário digite -1 ele sairá do programa
     */

    System.out.print("\033[H\033[2J");
    Scanner entrada = new Scanner(System.in);
    double nota = 0;
    double total = 0;
    int cont = 0;

    System.out.println("-- Programa de Notas --");
    System.out.println("\nBem vindo!");
    System.out.println("\nVamos começar. Para sair '-1'");
    System.out.println("\nInsira notas abaixo: ");

    while (nota != -1) {
      System.out.printf("Nota: ");
      nota = entrada.nextDouble();

      // Nota valida
      if (nota >= 0 && nota <= 10) {
          total += nota;
          cont++;
      } else if (nota != -1){
        System.out.println("\nInsira uma nota valida !!!!\n");
      }
    }

    System.out.printf("Quantidade de notas: %d\n", cont);
    System.out.printf("Média: %.2f\n", total / cont);

    entrada.close();

  }
}
