package _02_EstruturasDeControle;

public class _09_FOR {
  public static void main(String[] args) {
    int i;
    int j;

    // Exemplo de que o valor de i fora do laço é 10 e dentro do laço é máximo 9
    for (i = 0; i < 10; i++){System.out.println(i);}
    System.out.println("Fora do FOR: " + i);

    for (i = 0; i < 10; i++){
      for (j = 0; j < 10; j++) {
        System.out.printf("[%d %d]", i, j);
      }
      System.out.println();
    }
  }
}
