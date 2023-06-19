package _01_Fundamentos;

public class _11_ConversaoTipoPrimitivoNumerico {
  public static void main(String[] args) {
    double a = 1; // Conversão implicita
    System.out.println(a);

    float b = 1.0f; // Conversão Explicita
    // float c = (float) 1.0; // Cast
    System.out.println(b);

    int d = 4;
    byte e = (byte) d;
    System.out.println(e);

    double f = 1; // Conversão Implicita
    // int g = (int) f;
    System.out.println(f);
  }
}
