package methodsConstructionsClasses;
import java.util.Scanner;

public class constructAnimal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Float n1;
        String n2;

        System.out.println("Insira o tamanho do animal (Metros): ");
        n1 = read.nextFloat();
        read.nextLine();
        System.out.println("Insira a cor do animal: ");
        n2 = read.nextLine();

        Animal animal = new Animal(n1, n2);

        System.out.println("-- Ficha do Animal --");
        System.out.println("Tamanho: " + animal.getTamanho());
        System.out.println("Cor: " + animal.getCor());
    }
}