
import java.util.Arrays;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        String[][]produtos
                = {{"Itens", "Codigo", "Descrição", "Quantidade unitaria", "Valor Unitario", "Valor Total"},
                {"1", "478", "CAFE PINGADO", "1", "4.50", "4.50"},
                {"2", "479", "CAFE MOCACCHINO", "1", "10.50", "10.50"},
                {"3", "276", "STRUDEL MACA E CREME", "1", "8.10", "8.10"},
                {"4", "276", "STRUDEL MACA E CREME", "1", "8.10", "8.10"},};
        
        System.out.println(Arrays.toString(produtos));

    }

}
