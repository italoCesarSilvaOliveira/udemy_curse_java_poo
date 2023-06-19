package _01_Fundamentos.Desafios;

public class _04_DesafioLogico {
  public static void main(String[] args) {
    // Atrávez de dois trabalhos, caso seja realizado os dois será feita a
    // compra de uma televisão de 50 polegadas. Caso apenas 1 seja realizado
    // será feita a compra de uma telvisão de 30 polegadas. Caso haja a compra
    // de uma televisão, será feita a compra de sorvete.

    boolean trabalho1 = false;
    boolean trabalho2 = false;

    System.out.print("Será feita a compra da televisão de 50 polegadas? ");
    System.out.println(trabalho1 && trabalho2);
    System.out.print("Será feita a compra da televisão de 30 polegadas? ");
    System.out.println(trabalho1 ^ trabalho2);
    System.out.print("Será feita a compra de sorvete? ");
    System.out.println(trabalho1 || trabalho2);
    System.out.print("Mais saudavel?");
    System.out.println(!(trabalho1 || trabalho2));
  }
}
