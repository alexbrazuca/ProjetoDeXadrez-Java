package Application;

import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("informe a linha: ");
		int linha = sc.nextInt();
		System.out.println("informe a coluna: ");
		int coluna = sc.nextInt();
		Position posicao = new Position(linha,coluna);
		System.out.println(posicao);
	}

}
