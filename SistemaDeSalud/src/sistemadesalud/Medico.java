package sistemadesalud;
import java.time.*;


public class Medico {
    private String rut_medico;

    
    public Medico(String rut_medico) {
        this->rut_medico = rut_medico;
    }

    public int crearFichaClinica(String rut, String[] datos, LocalDateTime fechahora) {

    }

    public int crearTratamiento(int id_diagnosticoMedico, LocalDateTime fecha) {

    }
    // 
    public int prescribirDosis(int idMed, int cantidad, int duracion, LocalDateTime fecha) {
        int m = buscar
    }
    
}
