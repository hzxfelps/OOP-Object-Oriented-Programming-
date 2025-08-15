import java.util.Scanner;

public class ObjectFuncionario {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Insira a quantidade de funcionários a serem cadastrados: ");
        int n1 = read.nextInt();

        for (int i = 0; i < n1; i++) {
            read.nextLine();

            System.out.println("Insira o nome do Funcionário: ");
            String nome = read.nextLine();

            System.out.println("Insira o endereço do Funcionário: ");
            String endereco = read.nextLine();

            System.out.println("Insira o CPF do Funcionário: ");
            int CPF = read.nextInt();
            read.nextLine();

            System.out.println("Insira o telefone do Funcionário: ");
            int tel = read.nextInt();
            read.nextLine();

            System.out.println("Insira o cargo do Funcionário: ");
            String cargo = read.nextLine();

            System.out.println("Insira a data de admissão (apenas números): ");
            int dataadmissao = read.nextInt();
            read.nextLine();

            System.out.println("Insira a data de demissão (ou 0 se ainda ativo): ");
            int datademissao = read.nextInt();
            read.nextLine();

            System.out.println("Insira o e-mail do Funcionário: ");
            String email = read.nextLine();

            System.out.println("Insira o sexo do Funcionário (M/F): ");
            char sexo = read.next().charAt(0);
            read.nextLine();

            System.out.println("Insira o nível de escolaridade do Funcionário: ");
            String nivelescolaridade = read.nextLine();

            funcionario.setNome(nome);
            funcionario.setEndereco(endereco);
            funcionario.setCPF(CPF);
            funcionario.setTel(tel);
            funcionario.setCargo(cargo);
            funcionario.setDataadmissao(dataadmissao);
            funcionario.setDatademissao(datademissao);
            funcionario.setEmail(email);
            funcionario.setSexo(sexo);
            funcionario.setNivelescolaridade(nivelescolaridade);

            System.out.println("\n--- FICHA ---");
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getEndereco());
            System.out.println(funcionario.getCPF());
            System.out.println(funcionario.getTel());
            System.out.println(funcionario.getCargo());
            System.out.println(funcionario.getDataadmissao());
            System.out.println(funcionario.getDatademissao());
            System.out.println(funcionario.getEmail());
            System.out.println(funcionario.getSexo());
            System.out.println(funcionario.getNivelescolaridade());

            if (i == n1 - 1) {
                System.out.println("Cadastro encerrado.");
            } else {
                System.out.println("\n--- NOVA FICHA ---");
            }
        }
    }

    public static class Funcionario {
        String nome;
        String endereco;
        int CPF;
        int tel;
        String cargo;
        int dataadmissao;
        int datademissao;
        String email;
        char sexo;
        String nivelescolaridade;

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getEndereco() { return endereco; }
        public void setEndereco(String endereco) { this.endereco = endereco; }

        public int getCPF() { return CPF; }
        public void setCPF(int CPF) { this.CPF = CPF; }

        public int getTel() { return tel; }
        public void setTel(int tel) { this.tel = tel; }

        public String getCargo() { return cargo; }
        public void setCargo(String cargo) { this.cargo = cargo; }

        public int getDataadmissao() { return dataadmissao; }
        public void setDataadmissao(int dataadmissao) { this.dataadmissao = dataadmissao; }

        public int getDatademissao() { return datademissao; }
        public void setDatademissao(int datademissao) { this.datademissao = datademissao; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public char getSexo() { return sexo; }
        public void setSexo(char sexo) { this.sexo = sexo; }

        public String getNivelescolaridade() { return nivelescolaridade; }
        public void setNivelescolaridade(String nivelescolaridade) { this.nivelescolaridade = nivelescolaridade; }
    }
}
