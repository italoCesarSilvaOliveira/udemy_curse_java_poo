package _01_Fundamentos.Desafios;

public class _03_DesafiosAritmeticos {
  public static void main(String[] args) {
    int a = 6 * (3 + 2);
    double b = Math.pow(a, 2);
    double c = b / (3 * 2);

    double d = (1 - 5) * (2 - 7);
    double e = d / 2;
    double f = Math.pow(e, 2);

    double g = c - f;

    double numerador = Math.pow(g, 3);
    double denominador = Math.pow(10, 3);

    double total = numerador / denominador;

    System.out.println(total);
  }
}
