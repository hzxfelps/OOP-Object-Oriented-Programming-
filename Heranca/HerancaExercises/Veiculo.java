package HerancaExercises;

import java.util.Scanner;

public class Veiculo {
    private int ano;
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo(int ano, String marca, String modelo, String cor) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int n1;
            String n2, n3, n4;

            System.out.println("Insira o Ano do Veículo: ");
            n1 = read.nextInt();
            read.nextLine(); // consumir o \n que fica depois do nextInt

            System.out.println("Insira a marca: ");
            n2 = read.nextLine();

            System.out.println("Insira o modelo: ");
            n3 = read.nextLine();

            System.out.println("Insira a cor: ");
            n4 = read.nextLine();

            Veiculo veiculo = new Veiculo(n1, n2, n3, n4);

            System.out.println("-- Ficha do Veículo --");
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Cor: " + veiculo.getCor());
        }
    }
}
