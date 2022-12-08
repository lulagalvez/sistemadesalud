package sistemadesalud;
import java.time.*;

public class DiagnosticoMedico {
    private int id;
    private String[] descripcion;
    private LocalDateTime fecha;
    private PatologiaMedica pat;
    private Medico medico;
    private Vector<Tratamiento> tratamientos;
   

    public DiagnosticoMedico(int id, Medico med) {
        this->tratamientos = new Vector();
        this->medico = med;
        this->id = id;
    }

    public DiagnosticoMedico(int id, Medico med, PatologiaMedica pat) {
        this->tratamientos = new Vector();
        this->id = id;
        this->pat = pat;
        this->medico = med;
    }

    public void agregarTratamiento(LocalDateTime fecha) {

    }
    public int agregarDosis(LocalDateTime fecha, int med, int cant, int dur) {

    }
}
