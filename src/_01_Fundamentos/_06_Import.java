package _01_Fundamentos;

import java.util.Date;

public class _06_Import {
  public static void main(String[] args) {

    // java.lang é a biblioteca mais básica e está disponivel em todas as classes.
    java.lang.String b = "Boa Tarde!";
    java.lang.System.out.println(b);

    String s = "Bom dia!";
    System.out.println(s);

    // Para poder usar o Date, é necessário importar uma biblioteca date
    // dentro do java.
    Date d = new Date();
    System.out.println(d);

    // OBS: Ctrl + Shift + O: Organiza os imports, ou seja, retira ou acrescenta o
    // que está faltando

    // JButton botao = new JButton();
  }
}
