package exercicios_task01;

import java.util.Scanner;

public class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Digite um número inteiro: ");
      int numero = sc.nextInt();

      String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

      System.out.println("O número é: " + resultado);

      System.out.print("Deseja inserir outro número? (S/N) ");
      String resposta = sc.next();
      if (!resposta.equalsIgnoreCase("S")) {
        System.out.println("Programa encerrado. Até a próxima!");
        break;
      }
    }

    sc.close();
  }
}
