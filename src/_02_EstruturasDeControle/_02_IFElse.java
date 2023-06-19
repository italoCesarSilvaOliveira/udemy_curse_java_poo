package _02_EstruturasDeControle;

import javax.swing.JOptionPane;

public class _02_IFElse {
  public static void main(String[] args) {
    String valor = JOptionPane.showInputDialog("Informe o número: ");
    int numero = Integer.parseInt(valor);

    if (numero % 2 == 0){
      System.out.println("Número é par...");
    }

    if (numero % 2 == 1){
      System.out.println("Número é impar...");
    }
  }
}
