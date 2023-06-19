package _03_ClasseEMetodos.Desafios._03_ClasseDataConstrutores;

public class DataTeste {
  public static void main(String[] args) {
    Data data = new Data();
    
    System.out.println(data.obterDataFormatada());

    data.dia = 21;
    data.mes = 05;
    data.ano = 2021;
    
    System.out.println(data.obterDataFormatada());
  }
}
