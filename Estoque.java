public class Estoque extends Setor {

    private static Estoque estoque = new Estoque();

    private Estoque() {}

    public static Estoque getInstancia() {
        return estoque;
    }

    public boolean atualizar(Cliente cliente) {
        logOperacao("Atualizando estoque...");
        return true;
    }
}
