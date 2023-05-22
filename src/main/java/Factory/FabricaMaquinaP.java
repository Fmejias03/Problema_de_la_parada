package Factory;
import Maquina.MaquinaP;
public class FabricaMaquinaP implements FabricaMaquina{
    @Override
    public MaquinaP crearMaquina() {
        return new MaquinaP();
    }
}
