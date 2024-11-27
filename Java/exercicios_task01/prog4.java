package exercicios_task01;

import java.util.Scanner;

public class prog4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o ano atual:");
    int anoAtual = sc.nextInt();

    int anoInicial = 1500;
    int mediaIdadeGeracao = 28;

    int anosPassados = anoAtual - anoInicial;

    int numeroGeracoes = anosPassados / mediaIdadeGeracao;

    System.out.println("Desde o ano " + anoInicial + " até " + anoAtual + " passaram aproximadamente " + numeroGeracoes
        + " gerações.");

    sc.close();
  }
}
