package exercicios_task01;

import java.util.Scanner;

public class prog9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int opcao = 0;
    while (opcao != 3) {
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Traduzir do português para o inglês");
      System.out.println("2 - Traduzir do inglês para o português");
      System.out.println("3 - Sair");

      opcao = sc.nextInt();
      sc.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Palavras disponíveis para tradução do português para o inglês:");
          System.out.println("Cachorro");
          System.out.println("Cidade");
          System.out.println("Feliz");
          System.out.println("Triste");
          System.out.println("\n");
          System.out.println("Digite uma palavra em português:");
          String palavraPortugues = sc.nextLine().toLowerCase();
          traduzirPortuguesParaIngles(palavraPortugues);
          break;

        case 2:
          System.out.println("Palavras disponíveis para tradução do inglês para o português:");
          System.out.println("Dog");
          System.out.println("City");
          System.out.println("Happy");
          System.out.println("Sad");
          System.out.println("\n");
          System.out.println("Digite uma palavra em inglês:");
          String palavraIngles = sc.nextLine().toLowerCase();
          traduzirInglesParaPortugues(palavraIngles);
          break;

        case 3:
          System.out.println("Saindo...");
          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }

    sc.close();
  }

  public static void traduzirPortuguesParaIngles(String palavra) {
    switch (palavra) {
      case "cachorro":
        System.out.println("Cachorro em inglês é Dog");
        break;
      case "cidade":
        System.out.println("Cidade em inglês é City");
        break;
      case "feliz":
        System.out.println("Feliz em inglês é Happy");
        break;
      case "triste":
        System.out.println("Triste em inglês é Sad");
        break;
      default:
        System.out.println("Essa palavra não é válida.");
        break;
    }
  }

  public static void traduzirInglesParaPortugues(String palavra) {
    switch (palavra) {
      case "dog":
        System.out.println("Dog em português é Cachorro");
        break;
      case "city":
        System.out.println("City em português é Cidade");
        break;
      case "happy":
        System.out.println("Happy em português é Feliz");
        break;
      case "sad":
        System.out.println("Sad em português é Triste");
        break;
      default:
        System.out.println("Essa palavra não é válida.");
        break;
    }
  }
}
