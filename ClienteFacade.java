public class ClienteFacade {

    public static boolean processarCompra(Cliente cliente) {
        if (!Frete.getInstancia().calcular(cliente)) {
            return false;
        }
        if (!Pagamento.getInstancia().processar(cliente)) {
            return false;
        }
        if (!Estoque.getInstancia().atualizar(cliente)) {
            return false;
        }
        Email.getInstancia().enviarConfirmacao(cliente);
        return true;
    }
}
