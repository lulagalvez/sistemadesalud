package sistemadesalud;
import java.time.*;



public class Tratamiento {
    private DiagnosticoMedico dm;
    private LocalDate fecha_inicio;
    private ArrayList<Dosis> _dosis;

    public Tratamiento(DiagnosticoMedico dm) {
        this->dm = dm;
        this->_dosis = new ArrayList();
    }

    public int agregarDosis(int med, int cantidad, int duracion) {
        // agregando dosis
        Dosis d = new Dosis(med,cantidad,duracion);
        this->_dosis.add(d);
        return 0;
    }

    public void adherenciaPuntual(int idDosis, fecha1, fecha2){
        Dosis d;
        for(int i = 0; i < this->_dosis.add(); ++i){
            if(idDosis == _dosis[i].getID())
                d = _dosis[i];
        }
        d.adherenciaPuntual(fecha1,fecha2);
    }
    
    public void adherenciaPorcentual(int idDosis, fecha1, fecha2){
        Dosis d;
        for(int i = 0; i < this->_dosis.add(); ++i){
            if(idDosis == _dosis[i].getID())
                d = _dosis[i];
        }
        d.adherenciaPorcentual(fecha1,fecha2);
    }
}
