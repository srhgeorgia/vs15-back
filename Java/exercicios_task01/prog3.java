package exercicios_task01;

import java.util.Scanner;

public class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em celsius: \n");
    double C = sc.nextDouble();
    double F = (9 * C / 5.0) + 32;
    System.out.println("Equivalente em Fahrenheit \n" + F);
    System.out.println("Deseja repetir? [S/N]");

    sc.nextLine();

    String resposta = sc.nextLine();

    while (resposta.equalsIgnoreCase("S")) {
      System.out.println("Digite a temperatura em celsius: \n");
      C = sc.nextDouble();
      F = (9 * C / 5.0) + 32;
      System.out.println("Equivalente em Fahrenheit \n" + F);
      System.out.println("Deseja repetir? [S/N]");

      sc.nextLine();

      resposta = sc.nextLine();

      if (resposta.equalsIgnoreCase("N")) {
        System.out.println("Até mais!");
        break;
      }
    }

    sc.close();
  }
}
