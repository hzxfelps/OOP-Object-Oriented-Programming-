import java.util.Scanner;
public class exCadeira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        class Cadeira{
            String tipo;
            String cor;
            String material;
            String descansoBraco;

            public void setTipo(String tipo){
                this.tipo = tipo;
            }

            public String getTipo() {
                return tipo;
            }

            public void setCor(String cor){
                this.cor = cor;
            }
            public String getCor(){
                return cor;
            }

            public void setMaterial(String material){
                this.material = material;
            }

            public String getMaterial() {
                return material;
            }

            public String getDescansoBraco() {
                return descansoBraco;
            }

            public void setDescansoBraco(String descansoBraco) {
                this.descansoBraco = descansoBraco;
            }
        }

        System.out.println("Entre com o numero de cadeiras: ");
        int n = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<n;i++) {


            System.out.println("Entre com o tipo de cadeira: ");//]
            String tipo = scan.nextLine();
            System.out.println("Entre com a cor da cadeira: ");
            String cor = scan.nextLine();
            System.out.println("Entre com o material da cadeira: ");
            String material = scan.nextLine();
            System.out.println("A cadeira tem descanso de braço?  ");
            String descansoBraco = scan.nextLine();


            Cadeira Cadeira1 = new Cadeira();

            Cadeira1.setTipo(tipo);
            Cadeira1.setCor(cor);
            Cadeira1.setMaterial(material);
            Cadeira1.setDescansoBraco(descansoBraco);

            System.out.println("-------- Cadeira " + (i + 1) + " --------");
            System.out.println("Modelo: " + Cadeira1.getTipo());
            System.out.println("Cor: " + Cadeira1.getCor());
            System.out.println("Material: " + Cadeira1.getMaterial());
            System.out.println("Descanso de Braço: " + Cadeira1.getDescansoBraco());
            System.out.println("-------------------------");

        }
    }
}