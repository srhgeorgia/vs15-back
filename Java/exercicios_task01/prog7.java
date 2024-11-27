package exercicios_task01;

import java.util.Scanner;

public class prog7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Digite a quantidade de alunos na turma:");
      int quantidadeAlunos = sc.nextInt();
      sc.nextLine();

      for (int i = 1; i <= quantidadeAlunos; i++) {
        System.out.println("\n");
        System.out.println("Digite o nome do aluno " + i + ":");
        String nome = sc.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = sc.nextDouble();
        sc.nextLine();

        System.out.println("\n");

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Aluno: %s | Média: %.2f%n", nome, media);
      }

      System.out.println("Deseja inserir outra turma? (S/N)");
      String resposta = sc.nextLine();
      if (!resposta.equalsIgnoreCase("S")) {
        System.out.println("Programa encerrado. Até a próxima!");
        break;
      }
    }

    sc.close();
  }
}
