package Maquina;

public class MaquinaH extends Maquina{
    @Override
    public String getNombre() {
        return "Máquina H";
    }

    @Override
    protected String getPlano() {
        return null;
    }

    public boolean seAtasca(Maquina maquina, String entrada) {
        // Obtener el plano de la máquina a probar
        String plano = maquina.getPlano();

        // Simular la máquina con la entrada dada
        boolean seAtasca = simularMaquina(plano, entrada);

        // Imprimir el resultado
        if (seAtasca) {
            System.out.println("Se atasca");
        } else {
            System.out.println("No se atasca");
        }

        // Devolver el resultado
        return seAtasca;
    }

    private boolean simularMaquina(String plano, String entrada) {
        // Aquí implementarías la lógica de simulación de la máquina
        // utilizando el plano y la entrada proporcionados

        // Por simplicidad, asumiremos que H siempre devuelve que la máquina se atasca
        return true;
    }
}
