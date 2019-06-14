package listadecontatos;

import java.util.ArrayList;

public class Dados {

    ArrayList<Contato> contatos = new ArrayList();

    public void cadastraContato(Contato contato) {
        contatos.add(contato);

    }

    public void removeCadastro(Contato contato) {
        contatos.remove(contato);

    }

    public int numeroDeContatos() {
        return contatos.size();
    }

}
