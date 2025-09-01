package EncapsulamentExercises;
import java.util.Scanner;
public class Tema {
    private long ID;
    private String nome;
    private double valorAluguel;
    private String corToalha;

    public Tema(long ID, String nome, double valorAluguel, String corToalha) {
        this.ID = ID;
        this.nome = nome;
        this.valorAluguel = valorAluguel;
        this.corToalha = corToalha;
    }

    public String getNome() {
        return nome;
    }
    public long getID() {
        return ID;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public String getCorToalha() {
        return corToalha;
    }
    public static void main(String[] args) {

            Scanner read = new Scanner(System.in);
            String n1, n4;
            double n3;
            long n2;

            System.out.println("Insira o Tema da festa: ");
            n1 = read.nextLine();

            System.out.println("Insira ID : ");
            n2 = read.nextLong();
            read.nextLine();

            System.out.println("Insira o valor do Aluguel: ");
            n3 = read.nextDouble();
            read.nextLine();

            System.out.println("Insira a cor da toalha: ");
            n4 = read.nextLine();

            Tema tema = new Tema(n2, n1, n3, n4);

            System.out.println("-- Ficha do tema --");
            System.out.println("Tema: " + tema.getNome());
            System.out.println("ID: " + tema.getID());
            System.out.println("Valor do Aluguel: " + tema.getValorAluguel());
            System.out.println("Cor da toalha: " + tema.getCorToalha());
    }
}
