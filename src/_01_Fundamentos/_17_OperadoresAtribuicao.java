package _01_Fundamentos;

public class _17_OperadoresAtribuicao {
  public static void main(String[] args) {
    int a = 3;
    int b = a;
    int c = a + b;
    System.out.println(c);

    // c = c + b;
    c += b;
    c -= b;
    c *= b;
    c /= b;
    c %= b;
    System.out.println(c);
  }
}
