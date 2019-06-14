import java.util.ArrayList;

public class Produtos {

    public static void main(String[] args) {

        ArrayList<String> itens = new ArrayList<>();
        itens.add("1");
        itens.add("2");
        itens.add("3");
        itens.add("4");

        ArrayList<String> codigo = new ArrayList<>();
        codigo.add("478");
        codigo.add("479");
        codigo.add("276");
        codigo.add("276");

        ArrayList<String> prod = new ArrayList<>();
        prod.add("Cafe Pingado");
        prod.add("Cafe Mocacchino");
        prod.add("Strudel Maça e creme");
        prod.add("Strudel Maça e creme");

        ArrayList<String> qtde = new ArrayList<>();
        qtde.add("1");
        qtde.add("1");
        qtde.add("1");
        qtde.add("1");

        ArrayList<String> vunit = new ArrayList<>();
        vunit.add("4,50");
        vunit.add("10.50");
        vunit.add("8.10");
        vunit.add("8.10");

        ArrayList<String> vtotal = new ArrayList<>();
        vtotal.add("4,50");
        vtotal.add("10.50");
        vtotal.add("8.10");
        vtotal.add("8.10");

        System.out.println(itens);
        System.out.println(codigo);
        System.out.println(prod);
        System.out.println(qtde);
        System.out.println(vunit);
        System.out.println(vtotal);

    }

}
