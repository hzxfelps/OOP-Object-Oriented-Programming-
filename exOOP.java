import java.util.Scanner;
public class exOOP {
    public static void main (String[] args){
        Scanner read = new Scanner (System.in);
        Pessoa ppl = new Pessoa();

        System.out.println("Quantas fichas ( de pessoas )  você gostaria de inserir? ");
        int n1 = read.nextInt();
        //colocar nextline pra essa porra nao pular linha

        read.nextLine();

        for (int i = 0; i < n1; i++){
            System.out.println("Insira o seu nome: ");
            String nome = read.nextLine();
            System.out.println("Insira sua idade: ");
            int idade = read.nextInt();
            //colocar netline mais tarde pra nao pular a linha
            read.nextLine();
            System.out.println("Insira seu endereço (Cidade e País): ");
            String endereco = read.nextLine();
            System.out.println("Insira sua profissão: ");
            String profissao = read.nextLine();

            ppl.setNome(nome);
            ppl.setIdade(idade);
            ppl.setEndereco(endereco);
            ppl.setProfissao(profissao);
            
            //Colocar mostrando as informações depois de setar nas variaveis

            System.out.println("----- Pessoa -----");
            System.out.println(ppl.getNome());
            System.out.println(ppl.getIdade());
            System.out.println(ppl.getEndereco());
            System.out.println(ppl.getProfissao());

            if (i == n1 - 1) {
                //menos um pq essa porra ve no ultimo loop (-1 serve pra isso)
                System.out.println("Cadastro de ficha encerrado.");
            } else {
                System.out.println("\n-----Nova ficha-----");
            }
        }

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
