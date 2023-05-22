package Observer;

import Maquina.Maquina;

import java.util.ArrayList;
import java.util.List;

public class MaquinaX extends Maquina {
    private List<Observer> observadores = new ArrayList<>();
    private String entrada;

    @Override
    public String getNombre() {
        return "Máquina X";
    }

    @Override
    protected String getPlano() {
        return null;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
        notificarObservadores();
    }

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(entrada);
        }
    }

}
