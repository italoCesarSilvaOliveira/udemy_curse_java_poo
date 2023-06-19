package _02_EstruturasDeControle;

public class _13_CONTINUE {
  public static void main(String[] args) {

    // O continue serve para ir para o próximo laço de repetição. 

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1){
        continue;
      }

      System.out.println(i);
    }

    System.out.println();
    for (int i = 0; i < 10; i++) {
      if (i == 5){
        continue;
      }

      System.out.println(i);
    }
  }
}
