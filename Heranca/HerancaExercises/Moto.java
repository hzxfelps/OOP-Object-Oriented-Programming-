package HerancaExercises;
import java.util.Scanner;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(int ano, String marca, String modelo, String cor, int cilindradas) {
        super(ano, marca, modelo, cor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n5;
        String n2, n3, n4;

        System.out.println("Insira o Ano do Veículo: ");
        n1 = read.nextInt();
        read.nextLine();

        System.out.println("Insira a marca: ");
        n2 = read.nextLine();

        System.out.println("Insira o modelo: ");
        n3 = read.nextLine();

        System.out.println("Insira a cor: ");
        n4 = read.nextLine();

        System.out.println("Insira a quantidade de cilindradas da moto: ");
        n5 = read.nextInt();

        Moto moto = new Moto(n1, n2, n3, n4, n5);

        System.out.println("-- Ficha da Moto --");
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
