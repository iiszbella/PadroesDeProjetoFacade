public class Frete extends Setor {

    private static Frete frete = new Frete();

    private Frete() {}

    public static Frete getInstancia() {
        return frete;
    }

    public boolean calcular(Cliente cliente) {
        logOperacao("Calculando frete para o cliente...");
        return true;
    }
}
