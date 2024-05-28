package Pacote1;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no face");
    }

    @Override
    public void postarVideo() {
        System.out.println("Gravando video no face");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no facebook");

    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu sua publicação no facebook");
    }

    @Override
    public void fazStreaming(){
        System.out.println("Fazendo aquela live no face");
    }
    @Override
    public void compartilhar(){
        System.out.println("Vamos dar aquela atualizada no face");
    }

}
