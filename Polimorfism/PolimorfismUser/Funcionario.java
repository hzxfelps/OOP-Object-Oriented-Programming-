package PolimorfismUser;
import java.util.Scanner;

public class Funcionario implements InterfaceUser {
    long ID;
    String nome, tel, endereco;
    int matricula;
    double horasTrabalhadas;
    double valueHora;

    public Funcionario(long ID, String nome, String tel, String endereco, int matricula, double horasTrabalhadas, double valueHora) {
        this.ID = ID;
        this.nome = nome;
        this.tel = tel;
        this.endereco = endereco;
        this.matricula = matricula;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valueHora = valueHora;
    }

    public long getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getTel() {
        return tel;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    public void calcularSalario() {
        double salario = horasTrabalhadas * valueHora;
        System.out.println("Salário calculado: " + salario);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long ID;
        String nome, tel, endereco;
        int matricula;
        double horasTrabalhadas;
        double valueHora;

        System.out.println("Insira o ID: ");
        ID = read.nextLong();
        read.nextLine();

        System.out.println("Insira o nome do Funcionário: ");
        nome = read.nextLine();

        System.out.println("Insira o telefone do Funcionário: ");
        tel = read.nextLine();

        System.out.println("Endereço: ");
        endereco = read.nextLine();

        System.out.println("Mátricula: ");
        matricula = read.nextInt();
        read.nextLine();

        System.out.println("Insira o valor da Hora trabalhada: ");
        valueHora = read.nextDouble();
        read.nextLine();

        System.out.println("Insira a quantidade de horas trabalhadas(mensais): ");
        horasTrabalhadas = read.nextDouble();

        Funcionario funcionario = new Funcionario(ID, nome, tel, endereco, matricula, horasTrabalhadas, valueHora);

        System.out.println("-- Ficha do Funcionário --");
        System.out.println("ID: " + funcionario.getID());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Tel: " + funcionario.getTel());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        funcionario.calcularSalario();

    }
}