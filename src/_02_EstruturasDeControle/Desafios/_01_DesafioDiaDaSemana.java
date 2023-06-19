package _02_EstruturasDeControle.Desafios;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class _01_DesafioDiaDaSemana {
  public static void main(String[] args) throws UnsupportedEncodingException {
    System.setOut(new PrintStream(System.out, true, "UTF-8"));
    // O usuário terá que digitar o nome de algum dia da semana
    // e o programa retorarnará um número especifico.
    // Domingo - 1
    // Segunda - 2
    // Terça - 3
    // Quarta - 4
    // Quinta - 5
    // Sexta - 6
    // Sabado - 7

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um dia da semana: ");
    String diaSemana = entrada.next();

    if (diaSemana.equalsIgnoreCase("Domingo")) {
      System.out.println("Número 01");
    } else if (diaSemana.equalsIgnoreCase("Segunda")) {
      System.out.println("Número 02");
    } else if (diaSemana.equalsIgnoreCase("Terca")) {
      System.out.println(diaSemana);
    } else if (diaSemana.equalsIgnoreCase("Quarta")) {
      System.out.println("Número 04");
    } else if (diaSemana.equalsIgnoreCase("Quinta")) {
      System.out.println("Número 05");
    } else if (diaSemana.equalsIgnoreCase("Sexta")) {
      System.out.println("Número 06");
    } else if (diaSemana.equalsIgnoreCase("Sabado")) {
      System.out.println("Número 07");
    } else {
      System.out.println("Nome errado!!!");
    }

    System.out.println(diaSemana);

    entrada.close();
  }
}
