package methodsConstructionsClasses;
import java.util.Scanner;

public class constructCarro {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String n1;
        int n2;

        System.out.println("Insira a placa do carro: ");
        n1 = read.nextLine();

        System.out.println("Insira o número do Chassi: ");
        n2 = read.nextInt();

        Carro carro = new Carro(n1, n2);

        System.out.println("-- Ficha do carro --");
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("N° do Chassi: " + carro.getNumChassi());
    }
}