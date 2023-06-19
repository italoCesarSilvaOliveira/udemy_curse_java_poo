package _01_Fundamentos.Desafios;

import java.util.Scanner;

public class _02_DesafioConversao {
  public static void main(String[] args) {
    /* ------------------------------------------------------------------------- */

    /*
     * - Calcular a média dos últimos 3 salários de um funcionário.
     * - As variáveis devem ser string e convertidas para um valor númerico.
     * - O usuário pode escolher colocar o valor com virgula ou com ponto.
     */

    // String salario1 = JOptionPane.showInputDialog("Digite seu primeiro salário:
    // ");
    // String salario2 = JOptionPane.showInputDialog("Digite seu segundo salário:
    // ");
    // String salario3 = JOptionPane.showInputDialog("Digite seu terceiro salário:
    // ");
    //
    // Double s1 = Double.parseDouble(salario1);
    // Double s2 = Double.parseDouble(salario2);
    // Double s3 = Double.parseDouble(salario3);
    //
    // double media = (s1 + s2 + s3) / 3;
    //
    // System.out.println("01º Salário: R$" + s1);
    // System.out.println("02º Salário: R$" + s2);
    // System.out.println("03º Salário: R$" + s3);
    //
    // System.out.printf("\nMÉDIA: %.2f", media);

    /* ------------------------------------------------------------------------- */
    // Resposta do Exercicio:

    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe o primeiro salário: ");
    String salario01 = entrada.next().replace(",", ".");

    System.out.print("Informe o segundo salário: ");
    String salario02 = entrada.next().replace(",", ".");

    System.out.print("Informe o terceiro salário: ");
    String salario03 = entrada.next().replace(",", ".");

    double s1 = Double.parseDouble(salario01);
    double s2 = Double.parseDouble(salario02);
    double s3 = Double.parseDouble(salario03);

    double media = (s1 + s2 + s3) / 3;
    System.out.printf("\nMÉDIA DOS SALÁRIOS: %.2f", media);

    entrada.close();
  }
}
