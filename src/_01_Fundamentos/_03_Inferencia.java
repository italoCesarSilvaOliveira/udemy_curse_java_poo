package _01_Fundamentos;

public class _03_Inferencia {
  public static void main (String[] args){
    double a = 4.5;
    System.out.println(a);

    // Através da atribuição var, o java vai inferir que a variável é do tipo dependendo do valor;
    // -- Essa implementação vale apenas para o Java 10 para cima.
    var b = 4.5;
    System.out.println(b);

    var c = "Olá, estou inferindo uma String!";
    System.out.println(c);
}
}
