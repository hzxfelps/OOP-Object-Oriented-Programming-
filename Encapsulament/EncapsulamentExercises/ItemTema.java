package EncapsulamentExercises;
import java.util.Scanner;
public class ItemTema {
    private long ID;
    private String nome;
    private String descricao;

    public ItemTema(long ID, String nome, String descricao) {
        this.ID = ID;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }
    public long getID() {
        return ID;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        long n1;
        String n2, n3;

        System.out.println("Insira ID: ");
        n1 = read.nextLong();
        read.nextLine();

        System.out.println("Insira o nome do Item: ");
        n2 = read.nextLine();

        System.out.println("Insira a descrição do item: ");
        n3 = read.nextLine();

        ItemTema itemtema = new ItemTema(n1, n2, n3);

        System.out.println("-- Ficha do Item --");
        System.out.println("ID: " + itemtema.getID());
        System.out.println("Nome do item: " + itemtema.getNome());
        System.out.println("Descrição: " + itemtema.getDescricao());
    }
}
