package exercicios_task01;

import java.util.Scanner;

public class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número total de eleitores: ");
    int totalEleitores = sc.nextInt();

    if (totalEleitores <= 0) {
      System.out.println("Erro: O número total de eleitores deve ser maior que zero.");
      sc.close();
      return;
    }

    System.out.print("Digite o número de votos brancos: ");
    int votosBrancos = sc.nextInt();

    System.out.print("Digite o número de votos nulos: ");
    int votosNulos = sc.nextInt();

    System.out.print("Digite o número de votos válidos: ");
    int votosValidos = sc.nextInt();

    int totalVotos = votosBrancos + votosNulos + votosValidos;

    if (totalVotos != totalEleitores) {
      System.out.println("Erro: o total de votos não corresponde ao número total de eleitores.");
      System.out.println("Total de votos calculado: " + totalVotos);
      sc.close();
      return;
    }

    double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
    double percentualNulos = (double) votosNulos / totalEleitores * 100;
    double percentualValidos = (double) votosValidos / totalEleitores * 100;

    System.out.printf("\n");
    System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
    System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
    System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);

    sc.close();
  }
}
