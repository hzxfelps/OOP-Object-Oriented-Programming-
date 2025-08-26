package modificadores;

class ClassePessoa {
    private String nome;
    private int idade;
    private String profissao;
    private ClasseAutomovel automovel;


    //this code shall work inshallah


    public void compracarro (String cor, String nome, int velocidade) {
        automovel = new ClasseAutomovel();
        automovel.setCor(cor);
        automovel.setNome(nome);
        automovel.setVelocidade(velocidade);
    }

    public ClasseAutomovel getAutomovel() {
        return automovel;
    }


    public void setAutomovel(ClasseAutomovel automovel) {
        this.automovel = automovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}


//by the fire of the holy spirit, this class shall work. amen.


class ClasseAutomovel {
    private int velocidade;
    private String cor;
    private String nome;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}



