package Factory;

import Maquina.MaquinaC;

public class FabricaMaquinaC implements FabricaMaquina{
    @Override
    public MaquinaC crearMaquina() {
        return new MaquinaC();
    }
}
