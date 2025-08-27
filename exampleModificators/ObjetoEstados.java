package exampleModificators;

public class ObjetoEstados {

    public enum Estados {
        ACRE, ALAGOAS, AMAPA, AMAZONAS, BAHIA, CEARA, DISTRITO_FEDERAL,
        ESPIRITO_SANTO, GOIAS, MARANHAO, MATO_GROSSO, MATO_GROSSO_DO_SUL,
        MINAS_GERAIS, PARA, PARAIBA, PARANA, PERNAMBUCO, PIAUI, RIO_DE_JANEIRO,
        RIO_GRANDE_DO_NORTE, RIO_GRANDE_DO_SUL, RONDONIA, RORAIMA, SANTA_CATARINA,
        SAO_PAULO, SERGIPE, TOCANTINS
    }

    private Estados estado;

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public static void main(String[] args) {
        for (Estados estados : Estados.values()) {
            System.out.println(estados);
        }
    }
}
