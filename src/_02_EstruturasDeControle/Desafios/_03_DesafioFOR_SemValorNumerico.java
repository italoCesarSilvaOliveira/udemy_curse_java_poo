package _02_EstruturasDeControle.Desafios;

public class _03_DesafioFOR_SemValorNumerico {
  public static void main(String[] args) {
    
    for (String i = "o"; !i.equalsIgnoreCase("oooooo"); i+="o") {
      System.out.println(i);
    }

    // Não pode usar valor númerico no for
  }
}
