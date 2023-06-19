package _01_Fundamentos.Desafios;

import java.util.Scanner;

public class _08_DesafioIMC {
  public static void main(String[] args) {
    // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
    // IMC = peso / altura²
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Escreva a sua altura: ");
    double altura = entrada.nextDouble();

    System.out.print("Escreva o seu peso corporal: ");
    double peso = entrada.nextDouble();

    double imc = peso / Math.pow(altura, 2);

    String resultado = imc < 18.5 ? "Abaixo do Peso" :
     imc < 24.9 ? "Peso Normal" :
     imc < 29.9 ? "Sobrepeso" : 
     imc < 34.9 ? "Obesidade Grau I" :
     imc < 39.9 ? "Obesidade Grau II" : "Obesidade Grau III (Mórbida)";
     
     System.out.printf("\n[altura]: %.2f", altura);
     System.out.printf("\n[peso]: %.2f", peso);
     System.out.printf("\n\nIMC: %.2f   |   Status: %s", imc, resultado);

     entrada.close();
  }
}
