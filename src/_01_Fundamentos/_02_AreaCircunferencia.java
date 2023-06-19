package _01_Fundamentos;

public class _02_AreaCircunferencia {
  public static void main(String[] args){
    // System.out.println(2 + 3);
    double raio = 3.2;

    // final: Não posso alterar o valor definido pelo final
    final double pi = 3.14159;

    double area = pi * raio * raio;

    raio = 10;
    area = pi * raio * raio;

    // + : Concatenação
    System.out.println("Área é igual a : " + area);

    System.out.println(area);
}
}
