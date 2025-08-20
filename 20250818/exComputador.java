import java.util.Scanner;
public class exComputador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        class Computador{
            String monitor;
            String cpu;
            String gpu;
            String fonte;
            String memoriaRam;
            String placaMae;
            String cooler;
            String ssd;

            public String getMonitor() {
                return monitor;
            }

            public void setMonitor(String monitor) {
                this.monitor = monitor;
            }

            public String getCpu() {
                return cpu;
            }

            public void setCpu(String cpu) {
                this.cpu = cpu;
            }

            public void setGpu(String gpu) {
                this.gpu = gpu;
            }

            public String getGpu() {
                return gpu;
            }

            public String getFonte() {
                return fonte;
            }

            public void setFonte(String fonte) {
                this.fonte = fonte;
            }

            public String getMemoriaRam() {
                return memoriaRam;
            }

            public void setMemoriaRam(String memoriaRam) {
                this.memoriaRam = memoriaRam;
            }

            public String getPlacaMae() {
                return placaMae;
            }

            public void setPlacaMae(String placaMae) {
                this.placaMae = placaMae;
            }

            public String getCooler() {
                return cooler;
            }

            public void setCooler(String cooler) {
                this.cooler = cooler;
            }

            public String getSsd() {
                return ssd;
            }

            public void setSsd(String ssd) {
                this.ssd = ssd;
            }
        }

        System.out.println("Entre com o numero de computadores: ");
        int n = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<n;i++) {
            Computador redstaros = new Computador();

            System.out.println("Entre com o monitor escolhido: ");
            redstaros.setMonitor(scan.nextLine());
            System.out.println("Entre com a cpu escolhida: ");
            redstaros.setCpu(scan.nextLine());
            System.out.println("Entre com a gpu escolhida: ");
            redstaros.setGpu(scan.nextLine());
            System.out.println("Entre com a fonte escolhida: ");
            redstaros.setFonte(scan.nextLine());
            System.out.println("Entre com a memoria ram escolhida: ");
            redstaros.setMemoriaRam(scan.nextLine());
            System.out.println("Entre com a placa mae escolhida: ");
            redstaros.setPlacaMae(scan.nextLine());
            System.out.println("Entre cooler: ");
            redstaros.setCooler(scan.nextLine());
            System.out.println("Entre com o ssd: ");
            redstaros.setSsd(scan.nextLine());


            System.out.println("-------- Computador " + (i + 1) + " --------");
            System.out.println("Monitor: " + redstaros.getMonitor());
            System.out.println("Cpu: " + redstaros.getCpu());
            System.out.println("Gpu: " + redstaros.getGpu());
            System.out.println("Fonte: " + redstaros.getFonte());
            System.out.println("Memória Ram: " + redstaros.getMemoriaRam());
            System.out.println("Placa Mãe: " + redstaros.getPlacaMae());
            System.out.println("Cooler: " + redstaros.getCooler());
            System.out.println("SSD: " + redstaros.getSsd());
            System.out.println("------------------------------");

        }
    }
}