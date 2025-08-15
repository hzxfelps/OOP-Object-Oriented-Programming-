import java.util.Scanner;
public class ObjectPaciente {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        Paciente pacientes = new Paciente();

        System.out.println("Insira a quantidade de pacientes a serem castrados: ");
        int n1 = read.nextInt();

        for (int i = 0; i < n1; i++){
            read.nextLine();
            System.out.println("Insira o nome do Paciente: ");
            String nome = read.nextLine();
            System.out.println("Insira o endereço do Paciente: ");
            String endereco = read.nextLine();
            System.out.println("Insira o CPF do Paciente: ");
            String CPF = read.nextLine();
            System.out.println("Insira o sexo do Paciente (M/F): ");
            char sexo = read.next().charAt(0);
            //QUEBRA DE LINHAAA MALDITA
            read.nextLine();
            System.out.println("Insira o nível de escolaridade do Paciente: ");
            String nivelescolaridade  = read.nextLine();
            System.out.println("Insira o e-mail do Paciente: ");
            String email  = read.nextLine();
            System.out.println("Insira a data de nascimento do Paciente: ");
            String datadenascimento = read.nextLine();
            System.out.println("Insira o telefone do Paciente: ");
            String tel = read.nextLine();

            pacientes.setNome(nome);
            pacientes.setEndereco(endereco);
            pacientes.setCPF(CPF);
            pacientes.setSexo(sexo);
            pacientes.setNivelescolaridade(nivelescolaridade);
            pacientes.setEmail(email);
            pacientes.setDatadenascimento(datadenascimento);
            pacientes.setTel(tel);

            System.out.println("\n--- FICHA ---");
            System.out.println(pacientes.getNome());
            System.out.println(pacientes.getEndereco());
            System.out.println(pacientes.getCPF());
            System.out.println(pacientes.getNivelescolaridade());
            System.out.println(pacientes.getEmail());
            System.out.println(pacientes.getDatadenascimento());
            System.out.println(pacientes.getTel());

            if (i == n1 - 1){
                System.out.println("Cadastro encerrado.");
            }
            else {
                System.out.println("\n--- NOVA FICHA ---");
            }

        }

    }
    public static class Paciente{
        String nome;
        String endereco;
        String CPF;
        char sexo;
        String nivelescolaridade;
        String email;
        String datadenascimento;
        String tel;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getCPF() {
            return CPF;
        }

        public void setCPF(String CPF) {
            this.CPF = CPF;
        }

        public char getSexo() {
            return sexo;
        }
        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public String getNivelescolaridade() {
            return nivelescolaridade;
        }

        public void setNivelescolaridade(String nivelescolaridade) {
            this.nivelescolaridade = nivelescolaridade;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDatadenascimento() {
            return datadenascimento;
        }

        public void setDatadenascimento(String datadenascimento) {
            this.datadenascimento = datadenascimento;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }
}