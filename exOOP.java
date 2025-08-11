import java.util.Scanner;
import java.util.ArrayList;
public class exOOP {
    public static void main (String[] args){
        Scanner read = new Scanner (System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Quantas fichas ( de pessoas )  você gostaria de inserir? ");
        int n1 = read.nextInt();

        for (int i = 0; i < n1; i++){
            System.out.println("Insira o seu nome: ");
            String name = read.nextLine();
            System.out.println("Insira sua idade: ");
            int yo = read.nextInt();
            System.out.println("Insira seu endereço (Cidade e País): ");
            String endereco = read.nextLine();
            System.out.println("Insira sua profissão: ");
            String profissao = read.nextLine();
        }
        pessoa1.setNome("Tom cruise");
        pessoa1.setIdade(60);
        pessoa1.setEndereco("California, USA");
        pessoa1.setProfissao("Ator");

        pessoa2.setNome("Messi");
        pessoa2.setIdade(35);
        pessoa2.setEndereco("Miami, USA");
        pessoa2.setProfissao("Jogador de Futebol");

        System.out.println("----- OBJETO 1 -----");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getProfissao());

        System.out.println("----- OBJETO 2 -----");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getEndereco());
        System.out.println(pessoa2.getProfissao());
    }
    public static class Pessoa {
        String nome;
        int idade;
        String endereco;
        String profissao;
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public int getIdade(){
            return idade;
        }
        public void setIdade (int idade) {
            this.idade = idade;
        }
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco (String endereco) {
            this.endereco = endereco;
        }
        public String getProfissao() {
            return profissao;
        }
        public void setProfissao (String profissao) {
            this.profissao = profissao;
        }
    }
}