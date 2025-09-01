package EncapsulamentExercises;
import java.util.Scanner;
public class Endereco {
    private long ID;
    private int num;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;


    public Endereco(long ID, int num, String logradouro, String complemento, String bairro, String cidade, String cep, String uf) {
        this.ID = ID;
        this.num = num;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }

    public long getID() {
        return ID;
    }

    public int getNum() {
        return num;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        long n1;
        int n2;
        String n3, n4, n5, n6, n7, n8;

        System.out.println("Insira o ID: ");
        n1 = read.nextLong();
        read.nextLine();

        System.out.println("Insira o número da residência: ");
        n2 = read.nextInt();
        read.nextLine();

        System.out.println("Insira o logradouro: ");
        n3 = read.nextLine();

        System.out.println("Insira o complemento: ");
        n4 = read.nextLine();

        System.out.println("Insira o bairro: ");
        n5 = read.nextLine();

        System.out.println("Insira a cidade: ");
        n6 = read.nextLine();

        System.out.println("Insira o CEP: ");
        n7 = read.nextLine();

        System.out.println("Insira a UF (Unidade Federal): ");
        n8 = read.nextLine();

        Endereco endereco = new Endereco(n1,n2 ,n3 , n4, n5, n6,n7, n8);

        System.out.println("-- Ficha do Endereço --");
        System.out.println("ID: " + endereco.getID());
        System.out.println("N° da Residência: " + endereco.getNum());
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("UF: " + endereco.getUf());
    }
}
