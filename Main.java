import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Enter the first number: ");
        n1 = read.nextInt();

        System.out.println("Enter the second number: ");
        n2 = read.nextInt();

        try {
            n3 = n1 / n2;

            System.out.println("O valor da variável n3 é: "+ n3);
        } catch ( Exception error){
            System.out.println("Não existe números que possam ser divididos por 0.");
        }
    }
}