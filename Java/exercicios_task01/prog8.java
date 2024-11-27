package exercicios_task01;

import java.util.Scanner;

public class prog8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nome = "";
    String descricao = "";
    double preco = 0.0;
    int estoque = 0;

    int opcao = 0;
    while (opcao != 4) {
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Cadastrar novo produto");
      System.out.println("2 - Aplicar desconto percentual");
      System.out.println("3 - Exibir detalhes do produto");
      System.out.println("4 - Sair");

      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          sc.nextLine();
          System.out.println("\nDigite o nome do produto:");
          nome = sc.nextLine();
          System.out.println("Digite a descrição do produto:");
          descricao = sc.nextLine();
          System.out.println("Digite o preço do produto:");
          preco = sc.nextDouble();
          System.out.println("Digite o estoque disponível do produto:");
          estoque = sc.nextInt();
          System.out.println("\nProduto cadastrado com sucesso!");
          break;

        case 2:
          if (nome.isEmpty()) {
            System.out.println("Nenhum produto cadastrado! Cadastre um produto primeiro.");
          } else {
            System.out.println("Digite o percentual de desconto:");
            double desconto = sc.nextDouble();
            if (desconto > 0 && desconto <= 100) {
              preco -= preco * (desconto / 100);
              System.out.println("Desconto aplicado!");
            } else {
              System.out.println("Desconto inválido! O valor percentual deve ser entre 0 e 100.");
            }
          }
          break;

        case 3:
          if (nome.isEmpty()) {
            System.out.println("Nenhum produto cadastrado! Cadastre um produto primeiro.");
          } else {
            System.out.println("\nDetalhes do Produto:");
            System.out.println("Nome: " + nome);
            System.out.println("Descrição: " + descricao);
            System.out.println("Preço: R$ " + String.format("%.2f", preco));
            System.out.println("Estoque disponível: " + estoque);
          }
          break;

        case 4:
          System.out.println("Saindo...");
          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }

    sc.close();
  }
}
