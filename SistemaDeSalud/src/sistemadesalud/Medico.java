package sistemadesalud;
import java.time.*;


public class Medico {
    private String rut_medico;
    private Catalogo catalogo;
    private Vector<DiagnosticoMedico> diagnosticosMedicos;
    // Medico recibe catalogo
    public Medico(String rut_medico, Catalogo catalogo) {
        this->rut_medico = rut_medico;
        this->catalogo = catalogo;
        diagnosticosMedicos = new Vector();
    }

    public int crearFichaClinica(String rut, String[] datos, LocalDateTime fechahora) {

    }

    public int crearTratamiento(int id_diagnosticoMedico, LocalDateTime fecha) {

    }
    // 
    public int prescribirDosis(int idMed, int cantidad, int duracion, LocalDateTime fecha) {
        int m = buscar
    }

    public int consultarPorcentajeAdherencia(int idDiagnostico, int idTratamiento, int idDosis, Date f1, Date f2){

    }

     public int consultarPorcentajeAdherenciaPuntual(int idDiagnostico, int idTratamiento, int idDosis, Date f1, Date f2){

    }


    
}
