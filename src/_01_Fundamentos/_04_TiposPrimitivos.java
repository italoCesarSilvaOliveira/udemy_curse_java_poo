package _01_Fundamentos;

public class _04_TiposPrimitivos {
  public static void main(String[] args) {
    /*
     * Tipos Primitivos
     * --------------------
     *
     * - byte: Representa 1 byte = -128 a 127
     * - short: Representa 2 bytes = -32.768 a 32.767
     * - int: Representa 4 bytes = -2.147.483.648 a 2.147.483.647
     * - long: Representa 8 bytes = -9.223.372.036.854.775.808 a
     * 9.223.372.036.854.775.807
     *
     * - float: Representa 4 bytes = -3.40292347E+38 a +3.40292347E+38
     * - double: Representa 8 bytes = -1.79769313486231570E+308 a
     * +1.79769313486231570E+308
     *
     * - char: Representa 2 bytes
     * - boolean: false and true
     */

    // Informação de um Funcionário

    // Tipos Númericos Inteiros
    byte anosDeEmpresa = 23;
    short numeroDeVoos = 542;
    int id = 56789;
    long pontosAcumulados = 32348452;

    // Tipos numéricos reais
    float salario = 0.00f;
    double vendasAcumuladas = 2;

    // Tipo booleano
    boolean estaDeFerias = false;
    boolean temCerteza = true;

    // Tipo caractere
    char status = 'A';

    // Dias da empresa
    System.out.println(anosDeEmpresa * 365);

    // Número de Viagens
    System.out.println(numeroDeVoos / 2);

    // Pontos por real
    System.out.println(pontosAcumulados / vendasAcumuladas);
    System.out.println(id + ": ganha -> " + salario);
    System.out.println("Férias? " + estaDeFerias);
    System.out.println(status);
    System.out.println(temCerteza);
  }
}
