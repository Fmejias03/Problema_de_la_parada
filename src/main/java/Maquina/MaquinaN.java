package Maquina;

public class MaquinaN extends Maquina{
    @Override
    public String getNombre() {
        return "Máquina N";
    }

    @Override
    protected String getPlano() {
        return null;
    }

    public String negar(String entrada) {
        if (entrada.equals("No se atasca")) {
            return "Se atasca";
        } else {
            return "No se atasca (-:";
        }
    }
}
