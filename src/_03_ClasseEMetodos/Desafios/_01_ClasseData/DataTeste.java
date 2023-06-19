package _03_ClasseEMetodos.Desafios._01_ClasseData;

public class DataTeste {
  public static void main(String[] args) {
    Data data = new Data();

    data.dia = 21;
    data.mes = 05;
    data.ano = 2021;

    System.out.printf("%d / %d / %d", data.dia, data.mes, data.ano);
  }
}
