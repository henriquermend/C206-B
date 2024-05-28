package Pacote1;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no twitter");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no twitter");

    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtiu publicacao no twitter");
    }

    @Override
    public void compartilhar(){
        System.out.println("Vou ter que dar rt nesse post");
    }
}
