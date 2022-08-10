package program;

/*
 beecrowd | 1046 - Tempo de Jogo

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H1 = sc.nextInt();
		int H2 = sc.nextInt();
		
		if (H1 >= H2) System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (H1 - H2));
		else System.out.printf("O JOGO DUROU %d HORA(S)\n", (H2 - H1));
		sc.close();
	}
}
