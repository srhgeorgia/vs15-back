package exercicios_task01;

import java.util.Scanner;

public class prog10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("\nEscolha uma operação:");
      System.out.println("1 - Adição (+)");
      System.out.println("2 - Subtração (-)");
      System.out.println("3 - Multiplicação (*)");
      System.out.println("4 - Divisão (/)");
      System.out.println("5 - Cálculo de área de um círculo");
      System.out.println("6 - Cálculo de área de um retângulo");
      System.out.println("7 - Cálculo de área de um triângulo");
      System.out.println("8 - Cálculo de diâmetro de um círculo");
      System.out.println("9 - Sair");

      int opcao = sc.nextInt();

      if (opcao == 9) {
        System.out.println("Saindo...");
        break;
      }

      switch (opcao) {
        case 1:
          System.out.println("Digite o primeiro número:");
          double num1 = sc.nextDouble();
          System.out.println("Digite o segundo número:");
          double num2 = sc.nextDouble();
          System.out.println("Resultado: " + (num1 + num2));
          break;

        case 2:
          System.out.println("Digite o primeiro número:");
          num1 = sc.nextDouble();
          System.out.println("Digite o segundo número:");
          num2 = sc.nextDouble();
          System.out.println("Resultado: " + (num1 - num2));
          break;

        case 3:
          System.out.println("Digite o primeiro número:");
          num1 = sc.nextDouble();
          System.out.println("Digite o segundo número:");
          num2 = sc.nextDouble();
          System.out.println("Resultado: " + (num1 * num2));
          break;

        case 4:
          System.out.println("Digite o primeiro número:");
          num1 = sc.nextDouble();
          System.out.println("Digite o segundo número:");
          num2 = sc.nextDouble();
          if (num2 != 0) {
            System.out.println("Resultado: " + (num1 / num2));
          } else {
            System.out.println("Erro: Divisão por zero não permitida.");
          }
          break;

        case 5:
          System.out.println("Digite o raio do círculo:");
          double raio = sc.nextDouble();
          double areaCirculo = Math.PI * Math.pow(raio, 2);
          System.out.println("Área do círculo: " + areaCirculo);
          break;

        case 6:
          System.out.println("Digite a largura do retângulo:");
          double largura = sc.nextDouble();
          System.out.println("Digite a altura do retângulo:");
          double altura = sc.nextDouble();
          double areaRetangulo = largura * altura;
          System.out.println("Área do retângulo: " + areaRetangulo);
          break;

        case 7:
          System.out.println("Digite a base do triângulo:");
          double baseTriangulo = sc.nextDouble();
          System.out.println("Digite a altura do triângulo:");
          double alturaTriangulo = sc.nextDouble();
          double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
          System.out.println("Área do triângulo: " + areaTriangulo);
          break;

        case 8:
          System.out.println("Digite o raio do círculo:");
          raio = sc.nextDouble();
          double diametroCirculo = 2 * raio;
          System.out.println("Diâmetro do círculo: " + diametroCirculo);
          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }

    sc.close();
  }
}
