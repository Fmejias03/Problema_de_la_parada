package Mostrar;

import Factory.*;
import Maquina.*;
import Observer.MaquinaX;
import Observer.ObservadorMaquinaX;

public class Mostrar {
    public static void mostrar() {
        // Crear las fábricas de máquinas
        FabricaMaquina fabricaA = new FabricaMaquinaA();
        FabricaMaquina fabricaC = new FabricaMaquinaC();
        FabricaMaquina fabricaH = new FabricaMaquinaH();
        FabricaMaquina fabricaP = new FabricaMaquinaP();
        FabricaMaquina fabricaN = new FabricaMaquinaN();

        // Crear las máquinas
        Maquina maquinaA = fabricaA.crearMaquina();
        Maquina maquinaC = fabricaC.crearMaquina();
        Maquina maquinaH = fabricaH.crearMaquina();
        Maquina maquinaP = fabricaP.crearMaquina();
        Maquina maquinaN = fabricaN.crearMaquina();

        // Configurar la máquina X con los observadores
        MaquinaX maquinaX = new MaquinaX();
        maquinaX.agregarObservador(new ObservadorMaquinaX((MaquinaP) maquinaP, (MaquinaN) maquinaN));

        // Ejemplo de uso
        String entrada1 = "2*2";
        String entrada2 = "Estado actual del tablero de damas";

        System.out.println("Probando la máquina H con la máquina A y una multiplicación:");
        boolean seAtasca1 = ((MaquinaH) maquinaH).seAtasca(maquinaA, entrada1);
        System.out.println("Se atasca: " + seAtasca1);

        System.out.println("\nProbando la máquina H con la máquina C y un tablero de damas:");
        boolean seAtasca2 = ((MaquinaH) maquinaH).seAtasca(maquinaC, entrada2);
        System.out.println("Se atasca: " + seAtasca2);

        System.out.println("\nProbando la máquina X con su propio plano:");
        maquinaX.setEntrada(maquinaX.getNombre());

        System.out.println("\nProbando la máquina X con el plano de la máquina A y una multiplicación:");
        maquinaX.setEntrada(maquinaA.getNombre() + "," + entrada1);

        System.out.println("\nProbando la máquina X con el plano de la máquina C y un tablero de damas:");
        maquinaX.setEntrada(maquinaC.getNombre() + "," + entrada2);
    }
}

