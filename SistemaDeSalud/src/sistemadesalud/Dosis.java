package sistemadesalud;
import java.time.*;

public class Dosis {
    private int id;
    private int cantidad;
    private int horario;
    private int duracion;
    private int frecuencia;
    private Medicamento med;
    private Vector<DatosDeAdherencia> adherencia
    
    public Dosis(int med, int cant, int duracion) {
        this->med = med;
        this->cantidad = cant;
        this->duracion = duracion;
        adherencia = new Vector();
    }
    
    public int getID(){return this->id};
    
    public int calcularAdherenciaPuntual(LocalDate fecha1, LocalDate fecha2) {
        // Calculando resultado
        int result = 0;
        int errados = 0;
        int umbral = 30;
        for(int i = 0; i < this->adherencia.size(); ++i){
            LocalDate aux = this->adherencia.getFecha();
            int hora = this->adherencia.getHora();
            if(aux.compareTo(fecha1) >= 0 && aux.compareTo(fecha2) <= 0){
                if(hora == this->horario || ( hora < this->horario + umbral && hora > this->horario - umbral) ){
                    result++;
                }
                else{
                    errados++;
                }
            }
        }
        return (result * 100)/errados;
    }
    
    public double calcularAdherenciaPorcentual(LocalDate fecha1, LocalDate fecha2) {
        //  Calculando resultado, duracion = dias, frecuencia = cada cuantas horas se tiene que tomar
        //  entonces duracion * (24 / frecuencia) equivaldra al total de dosis a tomar.
        double total = (double)duracion * (24.0 / frecuencia);
        int cnt = 0;
        for (int i = 0; i < adherencia.size(); i++) {
            LocalDate aux = this->adherencia.getFecha();
            if (aux.compareTo(fecha1) >= 0 && aux.compareTo(fecha2) <= 0) {
                cnt++;
            }   
        }
        double result = 100.0 * ((double)cnt / total);
        return result;
    }
}
