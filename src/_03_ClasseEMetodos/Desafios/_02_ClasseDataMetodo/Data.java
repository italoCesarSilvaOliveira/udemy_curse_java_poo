package _03_ClasseEMetodos.Desafios._02_ClasseDataMetodo;

public class Data {
  int dia;
  int mes;
  int ano;

  String obterDataFormatada(){
    String formatado = dia + " / " + mes + " / " + ano;
    return formatado;
  }
}
