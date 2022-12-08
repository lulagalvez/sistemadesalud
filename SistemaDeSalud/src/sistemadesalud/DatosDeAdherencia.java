package sistemadesalud;
import java.time.*;

public class DatosDeAdherencia {
    private LocalDate fecha;
    private int hora;
    public DatosDeAdherencia() {
        
    }
    public LocalDate getFecha(){return this->fecha}
    
    public int getHora(){return this->hora}
}
