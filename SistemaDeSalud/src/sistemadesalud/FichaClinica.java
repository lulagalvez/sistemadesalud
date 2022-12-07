package sistemadesalud;
import java.time.*;



public class FichaClinica {
    private String rut_paciente;
    private String[] datos;
    
    public FichaClinica(String rut_paciente, String[] Datos) {
        this->rut_paciente = rut_paciente;
        this->datos = datos;
    }

    public int agregarConsulta(LocalDateTime fechahora) {
        // agregando consulta
        return 0;
    }
}
