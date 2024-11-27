package exercicios_task01;

import java.util.Scanner;

public class prog6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome;
    double salarioMensal;
    int mesesTrabalhados;
    boolean repetir;

    do {
      System.out.println("Digite o nome do funcionário:");
      nome = sc.nextLine();

      System.out.println("Digite o salário mensal do funcionário:");
      salarioMensal = sc.nextDouble();

      System.out.println("Digite o número de meses trabalhados no ano (entre 1 e 12):");
      mesesTrabalhados = sc.nextInt();

      repetir = false;
      if (salarioMensal < 0) {
        System.out.println("Erro: o salário mensal não pode ser negativo. Tente novamente.");
        repetir = true;
      } else if (mesesTrabalhados < 1 || mesesTrabalhados > 12) {
        System.out.println("Erro: o número de meses trabalhados deve estar entre 1 e 12. Tente novamente.");
        repetir = true;
      }

      sc.nextLine();

    } while (repetir);

    double salarioAnual = salarioMensal * mesesTrabalhados;

    System.out.println("\nFuncionário: " + nome);
    System.out.printf("Salário anual: R$ %.2f\n", salarioAnual);

    sc.close();
  }
}
