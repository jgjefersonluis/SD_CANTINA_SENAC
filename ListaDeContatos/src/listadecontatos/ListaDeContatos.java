package listadecontatos;

import java.util.ArrayList;

public class ListaDeContatos {

    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList();

        Contato contato = new Contato("Gustavo", "contato@gmail.com", "51 9999-6655");
        Contato contato1 = new Contato("Joao", "contato@gmail.com", "51 9999-6655");
        Contato contato2 = new Contato("Ricardo", "contato@gmail.com", "51 9999-6655");
        Contato contato3 = new Contato("Fernando", "contato@gmail.com", "51 9999-6655");
        Contato contato4 = new Contato("Marcelo", "contato@gmail.com", "51 9999-6655");
        Contato contato5 = new Contato("Maria", "contato@gmail.com", "51 9999-6655");

        contatos.add(contato);
        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);
        
        
        for (Contato c : contatos) {
            System.out.println(c);
        }
        
        System.out.println("Total de itens da Lista: " + contatos.size());
    }

}
