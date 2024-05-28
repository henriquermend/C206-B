package Pacote1;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no google plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no google plus");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentario no google plus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu sua publicação no googlePlus");
    }

    @Override
    public void compartilhar(){
        System.out.println("Compartilhando midia no google");
    }
    @Override
    public void fazStreaming(){
        System.out.println("Live aqui no google plus amanha as 16:00!!");
    }
}
