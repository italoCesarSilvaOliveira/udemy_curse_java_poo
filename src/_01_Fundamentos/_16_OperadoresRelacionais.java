package _01_Fundamentos;

public class _16_OperadoresRelacionais {
  public static void main(String[] args) {
    // // Recurso;
    // int a = 97;
    // int b = 'a';
    //
    // System.out.println(a == b);
    //
    // Esse estilo de comparação é valida, porém não tem muita utilidade. Está mais
    // para curiosidade mesmo

    System.out.println(3 > 4);
    System.out.println(3 >= 3);
    System.out.println(3 < 7);
    System.out.println(30 <= 4);
    System.out.println(30 != 4);

    double nota = 9.9;
    boolean bomComportamento = false;
    boolean passouPorMedia = nota >= 7;
    boolean temDesconto = bomComportamento && passouPorMedia;

    System.out.println("Tem desconto? " + temDesconto);
  }
}
