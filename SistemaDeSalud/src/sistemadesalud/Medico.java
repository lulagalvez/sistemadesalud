package sistemadesalud;
import java.time.*;


public class Medico {
    private String rut_medico;
    private Catalogo catalogo;
    private Vector<ConsultaMedica> consultasMedicas;
    private Vector<DiagnosticoMedico> diagnosticosMedicos;
    private Vector<FichaClinica> fichasclinicas;
    // Medico recibe catalogo
    public Medico(String rut_medico, Catalogo catalogo, FichaClinica fichasclinicas) {
        this->rut_medico = rut_medico;
        this->catalogo = catalogo;
        this->fichasclinicas = fichasclinicas;
        diagnosticosMedicos = new Vector();
        consultasMedicas = new Vector();
    }

    public void crearFichaClinica(String rut, String[] datos, LocalDate fechahora) {
        FichaClinica fc = new FichaClinica(rut, datos)
        fc.agregarConsulta(fechahora);
        this->fichasclinicas.add(fc);
    }

    public void crearTratamiento(int id_diagnosticoMedico, LocalDate fecha) {
        DiagnosticoMedico dm = NULL;
        for(int i = 0; i < this->diagnosticosMedicos.size();++i){
            if(this->diagnosticosMedicos[i].getID() == id_diagnosticoMedico){
                dm = this->diagnosticosMedicos[i];
            }
        }
        if(dm == NULL){
            dm = new DiagnosticoMedico(id_diagnosticoMedico);
        }
        dm.crearTratamiento(fecha);
    }
    // 
    public void prescribirDosis(int idMed, int idDiagnostico,int cantidad, int duracion, int idTratamiento) {
        Medicamento m = this->catalogo.buscarMedicamento(idMed);
        DiagnosticoMedico dm = NULL;
        for(int i = 0; i < this->diagnosticosMedicos.size(); ++i){
            if(this->diagnosticosMedicos[i].getID() == idDiagnostico){
                dm = this->diagnosticosMedicos[i];
            }
        }
        dm.agregarDosis(idTratamiento,m,cantidad,duracion);
    }

    public double consultarPorcentajeAdherencia(int idDiagnostico, int idTratamiento, int idDosis, LocalDate f1, LocalDate f2){
        DiagnosticoMedico dm;
        for(int i = 0; i < this->diagnosticosMedicos.size(); ++i){
            if(this->diagnosticosMedicos[i].getID() == idDiagnostico){
                dm = this->diagnosticosMedicos[i];
            }
        }
        return res = dm.adherenciaPuntual(idDosis,idTratamiento.f1.f2)

    }

    public double consultarPorcentajeAdherenciaPuntual(int idDiagnostico, int idTratamiento, int idDosis, LocalDate f1, LocalDate f2){
        DiagnosticoMedico dm;
        for(int i = 0; i < this->diagnosticosMedicos.size(); ++i){
            if(this->diagnosticosMedicos[i].getID() == idDiagnostico){
                dm = this->diagnosticosMedicos[i];
            }
        }
        return res = dm.adherenciaPuntual(idDosis,idTratamiento,f1,f2)
    }


    
}
