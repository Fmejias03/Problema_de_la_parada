package Maquina;

public class MaquinaP extends Maquina{
    @Override
    public String getNombre() {
        return "Máquina P";
    }

    @Override
    protected String getPlano() {
        return null;
    }

    public String duplicarEntrada(String entrada) {
        return entrada + entrada;
    }
}
