package Pacote1;
import Pacote2.DuplicateEmailException_checked;
import Pacote2.SemUsuario_Unchecked;
import java.util.HashSet;
import java.util.Set;



public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais = new HashSet<>();

    private static Set<String> registeredEmails = new HashSet<>();

    public Usuario(String nome, String email, HashSet<RedeSocial> redesSociais) {
        try {
            if (registeredEmails.contains(email)) {
                throw new DuplicateEmailException_checked("Email já foi registrado: " + email);
            }
            this.nome = nome;
            this.email = email;
            this.redesSociais = redesSociais;
            registeredEmails.add(email);
        } catch (DuplicateEmailException_checked e) {
            System.err.println(e.getMessage());
        }
    }
    public void checar(Usuario usuario) throws SemUsuario_Unchecked {
        if (usuario.nome == null || usuario.nome.isEmpty()) {
            throw new SemUsuario_Unchecked("Nome de usuário não pode ser vazio.");
        }else{
            usuario.nome = nome;
            System.out.println("Nome de usuário configurado: " + nome);
        }

    }

}


