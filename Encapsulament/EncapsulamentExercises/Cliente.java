package EncapsulamentExercises;
import java.util.Scanner;
public class Cliente {
    private long ID;
    private String nome;
    private String tel;
    private String cpf;
    private String rg;

    public Cliente(long ID, String nome, String tel, String cpf, String rg) {
        this.ID = ID;
        this.nome = nome;
        this.tel = tel;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getTel() {
        return tel;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public long getID() {
        return ID;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long n1;
        String n2, n3, n4, n5;

        System.out.println("Insira o ID do cliente: ");
        n1 = read.nextLong();
        read.nextLine();

        System.out.println("Insira o nome do cliente: ");
        n2 = read.nextLine();

        System.out.println("Insira o telefone do cliente: ");
        n3 = read.nextLine();

        System.out.println("Insira o CPF do cliente: ");
        n4 = read.nextLine();

        System.out.println("Insira o RG do cliente: ");
        n5 = read.nextLine();


        Cliente cliente = new Cliente(n1, n2, n3, n4, n5);

        System.out.println("-- Ficha do Cliente --");
        System.out.println("ID: " + cliente.getID());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTel());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("RG: " + cliente.getRg());
    }
}

