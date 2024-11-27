package exercicios_task01;

import java.util.Scanner;

public class prog12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String resposta = "S";

    while (resposta.equalsIgnoreCase("S")) {
      System.out.print("Digite o preço do livro: R$ ");
      double precoLivro = sc.nextDouble();

      System.out.print("Digite a quantidade de livros: ");
      int quantidadeLivros = sc.nextInt();

      double valorTotal = precoLivro * quantidadeLivros;

      if (valorTotal > 100) {
        valorTotal = valorTotal * 0.95;
      }
      System.out.println("\n");
      System.out.printf("Valor final da compra: R$ %.2f\n", valorTotal);
      System.out.println("\n");
      System.out.print("Deseja calcular outro livro? [S/N]: ");
      resposta = sc.next();
    }

    System.out.println("Até mais!");
    sc.close();
  }
}
