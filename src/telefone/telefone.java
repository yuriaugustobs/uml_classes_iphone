package telefone;

public class telefone implements aparelhoTelefonico{
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