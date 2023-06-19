package _02_EstruturasDeControle;

public class _04_WHILEDeterminado {
  public static void main(String[] args) {
    
    // O while é para uma estrutura inderminada porém conseguimos usa-lo
    // de forma determinada como o exemplo a baixo.
    int contador = 1;

    while (contador <= 10) {
      System.out.printf("i = %d", contador);
      contador++;
    }
  }
}
