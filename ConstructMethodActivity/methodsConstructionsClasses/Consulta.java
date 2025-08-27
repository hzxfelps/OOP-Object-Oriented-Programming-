package methodsConstructionsClasses;

import java.time.LocalDate;

public class Consulta {
    public String nomePaciente;
    public String nomeDentista;
    public LocalDate dataConsulta;

    public Consulta(String nomePaciente, String nomeDentista, LocalDate dataConsulta) {
        this.nomePaciente = nomePaciente;
        this.nomeDentista = nomeDentista;
        this.dataConsulta = dataConsulta;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeDentista() {
        return nomeDentista;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }
}
