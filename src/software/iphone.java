package software;

import navegador.navegadorInternet;
import reprodutor.reprodutorMusical;
import telefone.aparelhoTelefonico;

public class iphone implements navegadorInternet, reprodutorMusical, aparelhoTelefonico{
    
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

  
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }


    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }


    public static void main(String[] args) {
        iphone iphone = new iphone();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }
    
    public void selecionarMusica() { 
        System.out.println("Selecionando musica");
    }

    public void ligar(){
        System.out.println("Discando");
    }
    public void atender(){
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

}