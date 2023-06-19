package _01_Fundamentos;

public class _05_NotacaoPonto {
  public static void main(String[] args) {
    // double a = 2.3;

    // String não é uma palavra reservada e nem um tipo primitivo
    String s = "Bom dia X";
    s = s.replace("X", "Ítalo");
    s = s.toUpperCase();
    s = s.concat("!!!");

    System.out.println(s);

    String x = "Leo".toUpperCase();
    System.out.println(x);

    String y = "Bom dia X ".replace("X", "Gui").toUpperCase();
    System.out.println(y);

    // Tipos primitivos não tem o operador "."
    int A = 3;
    System.out.println(A);

  }
}
