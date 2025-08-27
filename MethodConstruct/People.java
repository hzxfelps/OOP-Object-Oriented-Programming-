import java.util.Scanner;

public class People {
    private String nome;
    private int idade;

    public People(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static class constructPeople {
        public static void main (String[] args){
            Scanner read = new Scanner (System.in);
            String n1;
            int n2;
            System.out.println("Insira o nome do jogador: ");
            n1 = read.nextLine();

            System.out.println("Insira a idade do jogador: ");
            n2 = read.nextInt();
            //setter
            People jogador = new People(n1, n2);
            jogador.setNome(n1);
            jogador.setIdade(n2);

            System.out.println("-- Ficha do jogador --");
            System.out.println("Nome: "+jogador.getNome());
            System.out.println("Idade: "+jogador.getIdade());

        }

    }
}
