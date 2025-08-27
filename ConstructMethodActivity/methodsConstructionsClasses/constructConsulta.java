package methodsConstructionsClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class constructConsulta {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String n1, n2, dataTexto;

        System.out.println("Insira o nome do Paciente: ");
        n1 = read.nextLine();

        System.out.println("Insira o nome do Dentista: ");
        n2 = read.nextLine();

        System.out.println("Insira a data da consulta (formato: dd/MM/yyyy): ");
        dataTexto = read.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConsulta = LocalDate.parse(dataTexto, formato);

        Consulta consulta = new Consulta(n1, n2, dataConsulta);

        System.out.println("-- Ficha da consulta --");
        System.out.println("Paciente: " + consulta.getNomePaciente());
        System.out.println("Dentista: " + consulta.getNomeDentista());
        System.out.println("Data: " + consulta.getDataConsulta().format(formato));
    }
}
