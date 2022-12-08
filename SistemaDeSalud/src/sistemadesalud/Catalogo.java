package sistemadesalud;

public class Catalogo {
    private ArrayList<Medicamento> listaMedicamentos;

    public Catalogo() {
        listaMedicamentos = new ArrayList();
    }
    public Medicamento buscarMedicamento(int idMed) {
        // Buscando en listaMedicamentos;
        Medicamento med = NULL;
        for(int i = 0; i < this->listaMedicamentos.size(); ++i){
            if(this->listaMedicamentos[i].getID() == idMed){
                med = this->listaMedicamentos[i];
            }
        }
        return med;
    }
}
