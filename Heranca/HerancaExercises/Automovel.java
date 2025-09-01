package HerancaExercises;

import java.util.Scanner;

public class Automovel extends Veiculo {
    private int numeroDePortas;
    private String motor;

    public Automovel(int ano, String marca, String modelo, String cor, int numeroDePortas, String motor) {
        super(ano, marca, modelo, cor);  // chama o construtor da classe pai Veiculo
        this.numeroDePortas = numeroDePortas;
        this.motor = motor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public String getMotor() {
        return motor;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o Ano do Automóvel: ");
        int ano = read.nextInt();
        read.nextLine();

        System.out.println("Insira a marca: ");
        String marca = read.nextLine();

        System.out.println("Insira o modelo: ");
        String modelo = read.nextLine();

        System.out.println("Insira a cor: ");
        String cor = read.nextLine();

        System.out.println("Insira o número de portas: ");
        int portas = read.nextInt();
        read.nextLine();

        System.out.println("Insira o tipo de motor: ");
        String motor = read.nextLine();

        Automovel automovel = new Automovel(ano, marca, modelo, cor, portas, motor);

        System.out.println("-- Ficha do Automóvel --");
        System.out.println("Ano: " + automovel.getAno());
        System.out.println("Marca: " + automovel.getMarca());
        System.out.println("Modelo: " + automovel.getModelo());
        System.out.println("Cor: " + automovel.getCor());
        System.out.println("Número de portas: " + automovel.getNumeroDePortas());
        System.out.println("Motor: " + automovel.getMotor());
    }
}
