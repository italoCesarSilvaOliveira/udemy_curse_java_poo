package _01_Fundamentos;

public class _19_Ternario {
  public static void main(String[] args) {
    double media = 6;

    // String resultadoParcial = media >= 5.0 ? "em recuperacao" : "reprovado.";
    String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "em recuperacao" : "reprovado.";

    System.out.println("O aluno está " + resultadoFinal);

    // -------------------------------------------------------------------------------

    double nota = 9.9;
    boolean bomComportamento = true;
    boolean passouPorMedia = nota >= 7;
    boolean temDesconto = bomComportamento && passouPorMedia;

    String resultado = temDesconto ? "sim" : "não";
    System.out.println("Tem Desconto? " + resultado);
  }
}
