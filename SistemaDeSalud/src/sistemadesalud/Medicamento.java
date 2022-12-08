package sistemadesalud;

public class Medicamento {
    private String nombre;
    private Double concentracion;
    private String tipo;
    
    public Medicamento(String nombre, String concentracion, String tipo) {
        this->nombre = nombre;
        this->concentracion = concentracion;
        this->tipo = tipo;
    }
    
}
