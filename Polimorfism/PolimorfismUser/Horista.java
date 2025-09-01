package PolimorfismUser;
import java.util.Scanner;

public class Horista implements InterfaceUser {
    long ID;
    String nome;
    double horasTrabalhadas;
    double valueHora;

    public Horista(long ID, String nome, double valueHora, double horasTrabalhadas) {
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

    public void calcularSalario() {
        double salario = horasTrabalhadas * valueHora;
        System.out.println("Salário calculado: " + salario);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long ID;
        String nome;
        double horasTrabalhadas;
        double valueHora;

        System.out.println("Insira o ID: ");
        ID = read.nextLong();
        read.nextLine();

        System.out.println("Insira o nome do Horista: ");
        nome = read.nextLine();

        System.out.println("Insira o valor da Hora trabalhada: ");
        valueHora = read.nextDouble();
        read.nextLine();

        System.out.println("Insira a quantidade de horas trabalhadas(mensais): ");
        horasTrabalhadas = read.nextDouble();

        Horista horista = new Horista(ID, nome, horasTrabalhadas, valueHora);

        System.out.println("-- Ficha do Horista --");
        System.out.println("ID: " + horista.getID());
        System.out.println("Nome: " + horista.getNome());
        horista.calcularSalario();

    }
}