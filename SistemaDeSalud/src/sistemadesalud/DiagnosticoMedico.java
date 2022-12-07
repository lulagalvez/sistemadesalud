package sistemadesalud;
import java.time.*;

public class DiagnosticoMedico {
    private int id;
    private String[] descripcion;
    private LocalDateTime fecha;
    public DiagnosticoMedico(int id) {
        this->id = id;
    }

    public void agregarTratamiento(LocalDateTime fecha) {

    }
    public void agregarDosis(LocalDateTime fecha, int med, int cant, int dur) {

    }
}
