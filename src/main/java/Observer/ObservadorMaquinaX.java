package Observer;

import Maquina.MaquinaN;
import Maquina.MaquinaP;

public class ObservadorMaquinaX implements Observer{
    private MaquinaP maquinaP;
    private MaquinaN maquinaN;

    public ObservadorMaquinaX(MaquinaP maquinaP, MaquinaN maquinaN) {
        this.maquinaP = maquinaP;
        this.maquinaN = maquinaN;
    }

    @Override
    public void actualizar(String entrada) {
        String salidaP = maquinaP.duplicarEntrada(entrada);
        String salidaN = maquinaN.negar(salidaP);
        System.out.println("Entrada: " + entrada);
        System.out.println("Salida de P: " + salidaP);
        System.out.println("Salida de N: " + salidaN);
    }
}
