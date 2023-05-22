package Factory;
import Maquina.MaquinaH;
public class FabricaMaquinaH implements FabricaMaquina{
    @Override
    public MaquinaH crearMaquina() {
        return new MaquinaH();
    }
}
