package Factory;

import Maquina.MaquinaA;

public class FabricaMaquinaA implements FabricaMaquina{
    @Override
    public MaquinaA crearMaquina() {
        return new MaquinaA();
    }
}
