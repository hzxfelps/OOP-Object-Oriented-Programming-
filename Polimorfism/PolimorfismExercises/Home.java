package PolimorfismExercises;

import java.util.Scanner;

public class Home implements InterfaceComputador {
    String nome, programFav;
    int idade;

    public Home(String nome, int idade, String programFav) {
        this.nome = nome;
        this.idade = idade;
        this.programFav = programFav;
    }

    public String getNome() {
        return nome;
    }

    public String getJogoFav() {
        return programFav;
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
        String programFav;

        System.out.println("Qual o nome do usuário?");
        nome = read.nextLine();

        System.out.println("Qual a idade do usuário?");
        idade = read.nextInt();
        read.nextLine();

        System.out.println("Qual o programa mais utilizado pelo usuário? (Powerpoint, excel e etc....)");
        programFav = read.nextLine();

        Home home = new Home(nome, idade, programFav);

        for (int i = 0; i < 10000; i++) {
            System.out.println("O que o usuário gostaria de fazer?\n1- Ligar\n2- Reiniciar\n3- Desligar\n4- Atualizar o sistema\n5- Encerrar janela de opções");
            int n1 = read.nextInt();
            switch (n1) {
                case 1:
                    home.ligar();
                    break;
                case 2:
                    home.reiniciar();
                    break;
                case 3:
                    home.desligar();
                    i = 11000;
                    break;
                case 4:
                    home.carregandoSistema();
                    break;
                case 5:
                    i = 11000;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
