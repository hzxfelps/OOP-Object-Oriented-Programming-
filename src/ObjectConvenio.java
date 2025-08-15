import java.util.Scanner;

public class ObjectConvenio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Convenio convenios = new Convenio();

        System.out.println("Insira a quantidade de convênios a serem registrados: ");
        int n1 = read.nextInt();

        for (int i = 0; i < n1; i++) {
            read.nextLine();
            System.out.println("Insira o nome do Paciente: ");
            String nome = read.nextLine();

            System.out.println("Insira o Plano de saúde do Paciente: ");
            String plano = read.nextLine();

            System.out.println("Insira a tarifa: ");
            String tarifa = read.nextLine();

            convenios.setNome(nome);
            convenios.setPlano(plano);
            convenios.setTarifa(tarifa);

            System.out.println("\n--- FICHA DO CONVÊNIO ---");
            System.out.println(convenios.getNome());
            System.out.println(convenios.getPlano());
            System.out.println(convenios.getTarifa());

            if (i == n1 - 1) {
                System.out.println("Cadastro encerrado.");
            } else {
                System.out.println("\n--- NOVO CONVÊNIO ---");
            }

        }

    }

    public static class Convenio {
        String nome;
        String plano;
        String tarifa;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPlano() {
            return plano;
        }

        public void setPlano(String plano) {
            this.plano = plano;
        }

        public String getTarifa() {
            return tarifa;
        }

        public void setTarifa(String tarifa) {
            this.tarifa = tarifa;
        }

    }
}