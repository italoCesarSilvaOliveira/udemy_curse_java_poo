package _01_Fundamentos.Desafios;

import javax.swing.JOptionPane;

public class _05_DesafioCalculadora {
  public static void main(String[] args) {
    String numero1 = JOptionPane.showInputDialog(""
        + "Digite o primeiro Número: ");
    String numero2 = JOptionPane.showInputDialog(""
        + "Digite o segundo Número: ");
    String sinal = JOptionPane.showInputDialog(""
        + "Escreva o sinal da conta que quer fazer: ");

    Double n1 = Double.parseDouble(numero1);
    Double n2 = Double.parseDouble(numero2);

    var resultado = sinal.equals("+")
        ? n1 + n2
        : sinal.equals("-")
            ? n1 - n2
            : sinal.equals("*")
                ? n1 * n2
                : sinal.equals("/")
                    ? n1 % n2
                    : sinal.equals("%")
                        ? n1 / n2
                        : "Sinal Invalido";

    System.out.println("Resultado da conta: " + resultado);

  }
}
