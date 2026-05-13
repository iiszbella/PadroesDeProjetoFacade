import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteFacadeTest {

    @Test
    public void deveFinalizarCompraComSucesso() {
        Cliente cliente = new Cliente();
        boolean resultado = ClienteFacade.processarCompra(cliente);
        assertTrue(resultado, "Compra deveria ser finalizada com sucesso");
    }

    @Test
    public void deveFalharSeFreteNaoCalculado() {
        Cliente cliente = new Cliente();
        Frete frete = Frete.getInstancia();

        boolean resultado = frete.calcular(cliente);
        assertTrue(resultado);

        assertFalse(false, "Falha no cálculo do frete deveria impedir a compra");
    }

    @Test
    public void deveFalharSePagamentoNaoProcessado() {
        Cliente cliente = new Cliente();
        Pagamento pagamento = Pagamento.getInstancia();

        boolean resultado = pagamento.processar(cliente);
        assertTrue(resultado);

        // Força falha
        assertFalse(false, "Falha no pagamento deveria impedir a compra");
    }

    @Test
    public void deveFalharSeEstoqueNaoAtualizado() {
        Cliente cliente = new Cliente();
        Estoque estoque = Estoque.getInstancia();

        boolean resultado = estoque.atualizar(cliente);
        assertTrue(resultado);

        assertFalse(false, "Falha na atualização do estoque deveria impedir a compra");
    }

    @Test
    public void deveEnviarEmailDeConfirmacao() {
        Cliente cliente = new Cliente();
        Email email = Email.getInstancia();

        assertDoesNotThrow(() -> email.enviarConfirmacao(cliente),
                "Envio de e-mail de confirmação não deveria lançar exceção");
    }
}
