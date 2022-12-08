package sistemadesalud;
import java.time.*;

public class Dosis {
    private int id;
    private int cantidad;
    private int horario;
    private int duracion;
    private int frecuencia;
    private Medicamento med;
    private ArrayList<DatosDeAdherencia> adherencia
    
    public Dosis(int med, int cant, int duracion) {
        this->med = med;
        this->cantidad = cant;
        this->duracion = duracion;
        adherencia = new ArrayList();
    }
    public int getID(){return this->id};
    public int calcularAdherenciaPuntual(LocalDate fecha1, LocalDate fecha2) {
        // Calculando resultado
        int result = 0;
        return result;
    }
    public double calcularAdherenciaPorcentual(LocalDate fecha1, LocalDate fecha2) {
        // Calculando resultado
        double result = 0.0;
        return result;
    }
}
