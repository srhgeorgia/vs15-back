package exercicios_task01;

import java.util.Scanner;

public class prog11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o nome do produto: ");
    String produto = sc.nextLine();

    System.out.print("Digite o preço do produto: R$ ");
    double preco = sc.nextDouble();

    System.out.println("\nProduto: " + produto);
    System.out.println("Preço R$: " + preco);

    for (int i = 1; i <= 10; i++) {
      double desconto = i * 5;
      if (desconto > 50) {
        desconto = 50;
      }

      double precoComDesconto = preco * (1 - desconto / 100);
      double precoTotal = precoComDesconto * i;

      System.out.printf("%d x R$ %.2f = R$ %.2f\n", i, precoComDesconto, precoTotal);
    }

    sc.close();
  }
}
