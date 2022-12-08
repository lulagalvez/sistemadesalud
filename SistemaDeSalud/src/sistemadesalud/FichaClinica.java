package sistemadesalud;
import java.time.*;



public class FichaClinica {
    private ArrayList<DiagnosticoMedico> diagnosticosMedicos;
    private ArrayList<ConsultaMedica> consultasMedicas;
    private String rut_paciente;
    private String[] datos;
    
    public FichaClinica(String rut_paciente, String[] datos) {
        this->rut_paciente = rut_paciente;
        this->datos = datos;
        diagnosticosMedicos = new ArrayList();
        consultasMedicas = new ArrayList();
    }

    public int agregarConsulta(LocalDateTime fechahora) {
        // agregando consulta
        ConsultaMedica cm = new ConsultaMedica(fechahora);
        this->consultasMedicas.add(cm);
        return 0;
    }
}
