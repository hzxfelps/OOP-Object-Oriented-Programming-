package methodsConstructionsClasses;

public class Animal {
    private Float tamanho;
    private String cor;

    public Animal(Float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}