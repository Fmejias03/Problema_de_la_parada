package Factory;

import Maquina.MaquinaN;

public class FabricaMaquinaN implements FabricaMaquina{
    @Override
    public MaquinaN crearMaquina() {
        return new MaquinaN();
    }

}
