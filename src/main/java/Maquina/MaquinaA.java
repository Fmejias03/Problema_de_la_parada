package Maquina;

public class MaquinaA extends Maquina{
    @Override
    public String getNombre() {
        return "Máquina A";
    }

    @Override
    protected String getPlano() {
        return null;
    }

    int multiplicar(int a, int b) {
        return a * b;
    }
}
