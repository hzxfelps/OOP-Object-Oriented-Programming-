package PolimorfismExercises;

import java.util.Scanner;

public class Gamer implements InterfaceComputador {
    String nome, jogoFav;
    int idade;

    public Gamer(String nome, int idade, String jogoFav) {
        this.nome = nome;
        this.idade = idade;
        this.jogoFav = jogoFav;
    }

    public String getNome() {
        return nome;
    }

    public String getJogoFav() {
        return jogoFav;
    }

    public int getIdade() {
        return idade;
    }

    public void ligar() {
        System.out.println("O sistema está ligando...");
    }

    public void reiniciar() {
        System.out.println("O sistema está reiniciando.");
    }

    public void desligar() {
        System.out.println("O sistema está desligando...");
    }

    public void carregandoSistema() {
        System.out.println("O sistema está carregando, aguarde.");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nome;
        int idade;
        String jogoFav;

        System.out.println("Qual o nome do gamer?");
        nome = read.nextLine();

        System.out.println("Qual a idade do gamer?");
        idade = read.nextInt();
        read.nextLine();

        System.out.println("Qual o jogo favorito do usuário?");
        jogoFav = read.nextLine();

        Gamer gamer = new Gamer(nome, idade, jogoFav);

        for (int i = 0; i < 10000; i++) {
            System.out.println("O que o usuário gostaria de fazer?\n1- Ligar\n2- Reiniciar\n3- Desligar\n4- Atualizar o sistema\n5- Encerrar janela de opções");
            int n1 = read.nextInt();
            switch (n1) {
                case 1:
                    gamer.ligar();
                    break;
                case 2:
                    gamer.reiniciar();
                    break;
                case 3:
                    gamer.desligar();
                    i = 11000;
                    break;
                case 4:
                    gamer.carregandoSistema();
                    break;
                case 5:
                    i = 11000;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
