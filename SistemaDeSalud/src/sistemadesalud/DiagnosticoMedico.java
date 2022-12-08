package sistemadesalud;
import java.time.*;

public class DiagnosticoMedico {
    private int id;
    private String[] descripcion;
    private LocalDate fecha;
    private PatologiaMedica pat;
    private Medico medico;
    private Vector<Tratamiento> tratamientos;
   

    public DiagnosticoMedico(int id) {
        this->tratamientos = new Vector();
        this->medico = medico;
        this->id = id;
    }

    public DiagnosticoMedico(int id, PatologiaMedica pat) {
        this->tratamientos = new Vector();
        this->id = id;
        this->pat = pat;
        this->medico = medico;
    }

    public void agregarTratamiento(LocalDate fecha) {
        Tratamiento t = new Tratamiento(fecha);
        this->tratamientos.add(t);
    }
    public void agregarDosis(int idTratamiento, int med, int cant, int dur) {
        for (int i = 0; i < tratamientos.size(); i++) {
            if (idTratamiento == tratamientos[i].getID()) {
                tratamientos[i].agregarDosis(med,cant,dur);
            }
        }
    }

    public double adherenciaPorcentual(int idDosis, int idTratamiento, LocalDate f1, LocalDate f2){
        for(int i = 0; i < this->tratamientos.size(); ++i){
            if(this->tratamientos[i].getID() == idTratamiento){
                return this->tratamientos[i].adherenciaPorcentual(idDosis,f1,f2)
            }
        }
    }

    public double adherenciaPuntual(int idDosis, int idTratamiento, LocalDate f1, LocalDate f2){
        for(int i = 0; i < this->tratamientos.size(); ++i){
            if(this->tratamientos[i].getID() == idTratamiento){
                return this->tratamientos[i].adherenciaPuntual(idDosis,f1,f2)
            }
        }
    }
}
