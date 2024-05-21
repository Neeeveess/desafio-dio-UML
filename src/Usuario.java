public class Usuario {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();

        telefone.ligar("911563156489");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        telefone.exibirPagina("localhost");
        telefone.adicionarNovaAba();
        telefone.atualizarPagina();

        telefone.tocar();
        telefone.pausar();
        telefone.selecionarMusica("cover");
    }

}
