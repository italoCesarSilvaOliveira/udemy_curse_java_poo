package _02_EstruturasDeControle.Desafios;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class _04_AtividadesFINAL {
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");

    // Variáveis gerais
    Scanner entrada = new Scanner(System.in);
    Calendar data;
    int cont = 0;
    int num = 0;
    int opcao = 0;

    do {
      System.out.println("-- Exercicios sobre Estruturas de Controle --");
      System.out.println("\n1 - Verificação Números 0 a 10");
      System.out.println("2 - Saber o se o ano atual é o ano bissexto");
      System.out.println("3 - Notas de Avaliação");
      System.out.println("4 - Número primo");
      System.out.println("5 - Refatorar o exercício 04, utilizando a estrutura switch.");
      System.out.println("6 - Tente descobrir o número");
      System.out.println("7 - Soma de números positivos");
      System.out.println("8 - Mostrando letras de uma palavra");
      System.out.println("9 - Imprimir o maior número");
      System.out.println("0 - Sair do programa");
      System.out.printf("\nEscolha uma opção: ");
      opcao = entrada.nextInt();
      System.out.print("\033[H\033[2J");

      switch (opcao) {
        case 1:
          // 1. Criar um programa que receba um número e verifique se ele está entre 0 e
          // 10 e é par;
          int numero = 0;
          System.out.println("-- Atividade Número 01--\n");
          System.out.print("Digite um número: ");
          numero = entrada.nextInt();

          System.out.println();

          if (numero > 0 && numero < 10) {
            System.out.printf("O número %d está entre 0 e 10", numero);
          } else {
            System.out.printf("O número %d NÃO está entre 0 e 10", numero);
          }

          if (numero % 2 == 0) {
            System.out.print(" e é par!\n\n");
          } else {
            System.out.print(" e é impar!\n\n1");
          }
          break;
        case 2:

          System.out.println("-- Atividade Número 02 --\n");
          data = Calendar.getInstance();
          System.out.print("A data atual é " + data.getTime());
          System.out.print("\n\nComo o ano é " + data.get(Calendar.YEAR));
          if ((data.get(Calendar.YEAR) % 4) == 0) {
            System.out.print(", é um ano bissexto!\n\n");
          } else {
            System.out.print(", não é um ano bissexto!\n\n");
          }
          break;

        case 3:
          System.out.println("-- Atividade Número 03 --\n");
          System.out.print("Escreva a 01º Nota: ");
          int primeiraNota = entrada.nextInt();

          System.out.print("\nEscreva a 02º Nota: ");
          int segundaNota = entrada.nextInt();

          int media = (primeiraNota + segundaNota) / 2;
          System.out.println();
          System.out.println("Sua média é: " + media);
          System.out.println();
          if (media >= 7 && media < 11) {
            System.out.println("Aprovado!");
          } else if (media < 7 && media >= 4) {
            System.out.println("Recuperação!");
          } else if (media < 4) {
            System.out.println("Reprovado!");
          } else {
            System.out.println("Valor Invalido!");
          }
          System.out.println();

          break;
        case 4:
          cont = 0;
          System.out.println("-- Atividade Número 04 --\n");
          System.out.print("Digite um número: ");
          num = entrada.nextInt();

          for (int i = 2; i < num; i++) {
            if (num % i == 0) {
              cont++;
              break;
            }
          }
          if (cont == 0) {
            System.out.printf("\nO número %d é um número primo!\n\n", num);
          } else {
            System.out.printf("\nO número %d NÃO é um número primo!\n\n", num);
          }
          break;
        case 5:
          System.out.println("-- Atividade Número 05\n");

          cont = 0;
          System.out.print("Digite um número: ");
          num = entrada.nextInt();
          System.out.print("\033[H\033[2J");

          for (int i = 2; i < num; i++) {
            if (num % i == 0) {
              cont++;
              break;
            }
          }
          switch (cont) {
            case 0:
              System.out.printf("\nO número %d é um número primo!\n\n", num);
              break;
            default:
              System.out.printf("\nO número %d NÃO é um número primo!\n\n", num);
              break;
          }
          break;
        case 6:
          Random r = new Random();
          System.out.println("-- Atividade Número 06 --\n");
          int numeroAleatorio = r.nextInt(100);
          int numeroComparavel = 0;
          System.out.println("Um número de 0 a 100 foi gerado. Tente advinha-lo.");

          for (int i = 10; i > 0; i--) {
            System.out.printf("\nTentativas: %d", i);
            System.out.print("\nnumero: ");
            numeroComparavel = entrada.nextInt();

            if (numeroComparavel == numeroAleatorio) {
              break;
            }
          }
          System.out.print("\033[H\033[2J");
          if (numeroComparavel != numeroAleatorio) {
            System.out.println("\nVocê não conseguiu!\n");
          } else {
            System.out.println("\nParabens você conseguiu!\n");
          }
          break;
        case 7:
          System.out.println("-- Atividade Número 07 --\n");
          int numeroS = 0;
          int resultado = 0;
          while (numeroS >= 0) {
            resultado += numeroS;
            System.out.printf("SOMA: %d\n\n", resultado);
            System.out.print("Escreva um número: ");
            numeroS = entrada.nextInt();
          }
          System.out.println();
          break;

        case 8:
          String palavra = "";
          System.out.println("-- Atividade Número 08 --\n");
          System.out.print("Escreva uma palavra: ");
          palavra = entrada.next();

          for (int i = 0; i < palavra.length(); i++) {
            System.out.print(" " + palavra.charAt(i));
          }
          System.out.println("\n");
          break;

        case 9:
          System.out.println("-- Atividade Número 09 --\n");
          System.out.println("\tEscreva 10 números");
          int numero9 = 0;
          int maior = 0;
          for (int i = 1; i < 11; i++) {
            System.out.printf("%dº numero: ", i);
            numero9 = entrada.nextInt();

            if (numero9 > maior) {
              maior = numero9;
            }
          }

          System.out.printf("\nO maior número digitado é: %d\n\n", maior);
          break;
        case 0:
          System.out.println("\n>>>> Saindo >>>>\n");
          break;
        default:
          System.out.println("Não existe essa opção!!!\n");
          break;
      }
    } while (opcao != 0);
    entrada.close();
  }
}
