package _01_Fundamentos.Desafios;

public class _01_DesafioVariavelCostantes {
  public static void main(String[] args) {
    // Para poder fazer testes e obter resultados rápidos, pode-se usar o
    // jshell no prompt de comando. Para sair: /exit

    /*
     * Exercicio:
     * Faça um programa que converta o valor de fareinght em Celcius.
     * Formula: (ºF - 32) x 5/9 = ºC
     */

    double F = 100;
    double C = (F - 32) * 5 / 9;

    System.out.println("Resultado: " + C);
  }
}
