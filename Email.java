public class Email extends Setor {

    private static Email email = new Email();

    private Email() {}

    public static Email getInstancia() {
        return email;
    }

    public void enviarConfirmacao(Cliente cliente) {
        logOperacao("Enviando e-mail de confirmação...");
    }
}
