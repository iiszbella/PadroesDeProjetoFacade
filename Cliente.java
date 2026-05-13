public class Cliente {

    public boolean finalizarCompra() {
        return ClienteFacade.processarCompra(this);
    }
}
