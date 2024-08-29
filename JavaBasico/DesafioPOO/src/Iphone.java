import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  // Implementação dos métodos de ReprodutorMusical
  @Override
  public void tocar() {
    System.out.println("Reproduzindo música...");
  }

  @Override
  public void pausar() {
    System.out.println("Música pausada.");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando a música: " + musica);
  }

  // Implementação dos métodos de AparelhoTelefonico
  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para o número: " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a chamada...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  // Implementação dos métodos de NavegadorInternet
  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando a página.");
  }

  // Método principal para teste
  public static void main(String[] args) {
    Iphone meuIphone = new Iphone();

    // Testando o Reprodutor Musical
    meuIphone.tocar();
    meuIphone.selecionarMusica("Imagine - John Lennon");
    meuIphone.pausar();

    // Testando o Aparelho Telefônico
    meuIphone.ligar("123456789");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    // Testando o Navegador Internet
    meuIphone.exibirPagina("www.exemplo.com");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPagina();
  }
}
