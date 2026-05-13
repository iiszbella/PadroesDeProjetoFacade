Atividade da disciplina de Padrões de Projeto – Façade
O projeto desenvolvido aplica o padrão Façade em um cenário de e-commerce, simulando o processo de compra de um cliente. 
A ideia central é demonstrar como o Façade simplifica a interação com subsistemas complexos, oferecendo uma única interface para operações que envolvem frete, pagamento, estoque e envio de e-mails.

No modelo proposto, a classe ClienteFacade funciona como a fachada principal, concentrando a lógica de coordenação entre os diversos setores.
O cliente, ao chamar apenas o método processarCompra(), não precisa conhecer os detalhes internos de cada subsistema. As classes Frete, Pagamento, Estoque e Email representam os componentes especializados, todos herdando da classe abstrata Setor, que fornece funcionalidades comuns como o registro de operações.

Escolhi o cenário de e-commerce porque ele reflete bem a lógica do Façade: o cliente deseja apenas finalizar a compra, enquanto o sistema precisa executar várias etapas internas.
O uso do Façade torna o código mais organizado, reduz o acoplamento entre classes e garante que o sistema seja flexível e fácil de manter.

Diagrama UML - https://drive.google.com/file/d/1d1DB5tKvGOjbuCmpofmLUkdO4rX3uwOE/view?usp=sharing
