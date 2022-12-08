package sistemadesalud;
import java.time.LocalDateTime;

public class ConsultaMedica {
    private LocalDateTime fechahora;
    private Medico med;
    
    public ConsultaMedica(Medico med) {
        this.fechahora = LocalDateTime.now();
        this->med = med;
    }
    
}
