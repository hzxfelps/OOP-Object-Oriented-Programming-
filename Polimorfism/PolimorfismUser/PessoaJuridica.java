package PolimorfismUser;
import java.util.Scanner;

public class PessoaJuridica implements InterfaceUser {
    long ID;
    String nome;
    double horasTrabalhadas;
    double valueHora;
    double tax;

    public PessoaJuridica(long ID, String nome, double horasTrabalhadas, double valueHora) {
        this.ID = ID;
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valueHora = valueHora;
    }

    public long getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValueHora() {
        return valueHora;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void calcularSalario() {
        double salario = horasTrabalhadas * valueHora;
        System.out.println("Salário Bruto: " + salario);
    }

    public void salarioLiquido() {
        double salario = horasTrabalhadas * valueHora;
        double salarioLiquido = salario * tax;
        System.out.println("Salário Líquido: " + salarioLiquido);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long ID;
        String nome;
        double horasTrabalhadas;
        double valueHora;
        double tax = 1;
        int n2;

        System.out.println("Insira o ID: ");
        ID = read.nextLong();
        read.nextLine();

        System.out.println("Insira o nome da Pessoa Juridica: ");
        nome = read.nextLine();

        System.out.println("Insira o valor da Hora trabalhada: ");
        valueHora = read.nextDouble();
        read.nextLine();

        System.out.println("Insira a quantidade de horas trabalhadas(mensais): ");
        horasTrabalhadas = read.nextDouble();

        System.out.println("Você gostaria de usar a taxa:\n1- Padrão(CNPJ)\n2- Inserida");
        int n1 = read.nextInt();

        PessoaJuridica pessoaJuridica = new PessoaJuridica(ID, nome, horasTrabalhadas, valueHora);

        if (n1 == 1) {
            System.out.println("Qual seu salário de contribuição:");
            System.out.println("1- Até R$1.045,00");
            System.out.println("2- De R$1.045,01 a R$2.089,60");
            System.out.println("3- De R$2.089,61 até R$3.134,40");
            System.out.println("4- De R$3.134,41 até R$6.101,06");
            System.out.println("5- Maior que R$6.101,06");

            n2 = read.nextInt();

            switch (n2) {
                case 1:
                    tax = 0.925;
                    break;
                case 2:
                    tax = 0.91;
                    break;
                case 3:
                    tax = 0.88;
                    break;
                case 4:
                    tax = 0.86;
                    break;
                case 5:
                    tax = 0.86;
                    break;
                default:
                    tax = 1;
                    break;
            }
        } else if (n1 == 2) {
            System.out.println("Insira a taxa: ");
            tax = read.nextDouble();
        }

        pessoaJuridica.setTax(tax);

        System.out.println("-- Ficha do Horista --");
        System.out.println("ID: " + pessoaJuridica.getID());
        System.out.println("Nome: " + pessoaJuridica.getNome());
        pessoaJuridica.calcularSalario();
        pessoaJuridica.salarioLiquido();

    }
}
