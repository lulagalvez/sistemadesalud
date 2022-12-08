package sistemadesalud;
import java.time.LocalDateTime;

public class ConsultaMedica {
    private LocalDate fechahora;

    
    public ConsultaMedica() {
        this.fechahora = LocalDateTime.now();
    }
    
}
