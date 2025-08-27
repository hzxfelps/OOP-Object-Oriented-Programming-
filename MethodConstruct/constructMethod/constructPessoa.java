package constructMethod;

import java.util.Scanner;

public class constructPessoa {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String n1;
        int n2;

        System.out.println("Insira o nome do jogador: ");
        n1 = read.nextLine();

        System.out.println("Insira a idade do jogador: ");
        n2 = read.nextInt();

        Pessoa jogador = new Pessoa(n1, n2);

        System.out.println("-- Ficha do jogador --");
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Idade: " + jogador.getIdade());
    }
}
