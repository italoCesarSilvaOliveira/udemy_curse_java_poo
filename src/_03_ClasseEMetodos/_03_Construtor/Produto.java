package _03_ClasseEMetodos._03_Construtor;

public class Produto {
  String nome;
  double preco;
  double desconto;

  Produto(){

  }

  Produto(String nomeInicial, double precoIicial, double descontoInicial) {
    nome = nomeInicial;
    preco = precoIicial;
    desconto = descontoInicial;
  }

  double precoComDesconto() {
    return preco * (1 - desconto);
  }

  double precoComDesconto(double descontoDoGerente){
    return preco * (1 - desconto + descontoDoGerente); 
  }
}
