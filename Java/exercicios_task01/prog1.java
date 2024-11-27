package exercicios_task01;

import java.util.Scanner;

public class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a hora de início:");
    int horaInicio = sc.nextInt();
    System.out.println("Digite agora os minutos:");
    int minutoInicio = sc.nextInt();

    System.out.println("Digite a hora de término:");
    int horaTermino = sc.nextInt();
    System.out.println("Digite agora os minutos:");
    int minutoTermino = sc.nextInt();

    int inicioEmMinutos = horaInicio * 60 + minutoInicio;
    int terminoEmMinutos = horaTermino * 60 + minutoTermino;

    int duracaoEmMinutos;
    if (terminoEmMinutos >= inicioEmMinutos) {
      duracaoEmMinutos = terminoEmMinutos - inicioEmMinutos;
    } else {
      duracaoEmMinutos = (24 * 60 - inicioEmMinutos) + terminoEmMinutos;
    }

    int duracaoHoras = duracaoEmMinutos / 60;
    int duracaoMinutos = duracaoEmMinutos % 60;

    System.out.println("A duração do jogo foi de " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");

    sc.close();
  }
}
