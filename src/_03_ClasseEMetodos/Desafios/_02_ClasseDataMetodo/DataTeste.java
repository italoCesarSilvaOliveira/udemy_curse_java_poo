package _03_ClasseEMetodos.Desafios._02_ClasseDataMetodo;

public class DataTeste {
  public static void main(String[] args) {
    Data data = new Data();

    data.dia = 21;
    data.mes = 05;
    data.ano = 2021;

    System.out.println(data.obterDataFormatada());
  }
}
