package _01_Fundamentos;

public class _07_TipoString {
  public static void main(String[] args) {
    // charAt: Pega um char (letra) que esteja em tal posição.
    System.out.println("Olá, Pessoal!".charAt(0));

    String s = "Boa Tarde!";
    System.out.println(s.concat("!!!"));
    System.out.println(s + "!!!");

    // Uma String não pode ter seu valor inicial alterado, ou seja, apartir do
    // momento que por exemplo:
    // String palavra = "Testando". Não tem como mudar esse valor da forma de
    // atribuição.

    System.out.println(s.startsWith("Boa")); // Retorna true ou false para como a primeira palavra da string começa.
    System.out.println(s.toLowerCase().startsWith("Boa")); // Faz toda a string da variável ficar com a letra pequena
    System.out.println(s.length()); // Retorna um valor inteiro, no caso, a quantidade de caracteres que tem na
                                    // variável s
    System.out.println(s.endsWith("Tarde")); // Acrescenta caracteres no final da string
    System.out.println(s.equals("boa tarde")); // Verifica se essas duas frases são iguais
    System.out.println(s.equalsIgnoreCase("boa tarde")); // Desconsidera Maiusculas e Minusculas

    var nome = "Italo";
    var sobrenome = "Oliveira";
    var idade = 33;
    var salario = 12345.987;

    System.out.println(
        "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
    System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f salario ", nome, sobrenome, idade, salario);

    String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f salario \n\n", nome, sobrenome, idade,
        salario);
    System.out.println(frase);
    System.out.println("Frase Qualquer".contains("qual"));
    System.out.println("Frase Qualquer".indexOf("qual"));
    System.out.println("Frase Qualquer".substring(6));
    System.out.println("Frase Qualquer".substring(6, 10));
    
  }
}
