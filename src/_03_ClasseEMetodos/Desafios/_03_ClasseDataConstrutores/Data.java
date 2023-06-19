package _03_ClasseEMetodos.Desafios._03_ClasseDataConstrutores;

public class Data {
  int dia;
  int mes;
  int ano;

  Data (){
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  Data (int diaConst, int mesConst, int anoConst){
    dia = diaConst;
    mes = mesConst;
    ano = anoConst;
  }

  String obterDataFormatada(){
    String formatado = dia + " / " + mes + " / " + ano;
    return formatado;
  }
}
