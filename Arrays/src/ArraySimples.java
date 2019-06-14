import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySimples {

    public static void main(String[] args) {

        String[] itens = {"1", "2", "3", "4"};
        String[] cod = {"478", "479", "276", "276"};
        String[] desc = {"CAFE PINGADO", "CAFE MOCACCHINO", "STRUDEL MACA E CREME", "STRUDEL MACA E CREME"};
        String[] qtde = {"1", "1", "1", "1"};
        String[] vunit = {"4.50", "10.50", "8.10", "8.10"};
        String[] vtotal = {"4.50", "10.50", "8.10", "8.10"};
    //    Double[] vtotal = {4.50, 10.50, 8.10, 8.10};

        System.out.println(Arrays.toString(itens));
        System.out.println(Arrays.toString(cod));
        System.out.println(Arrays.toString(desc));
        System.out.println(Arrays.toString(qtde));
        System.out.println(Arrays.toString(vunit));
        System.out.println(Arrays.toString(vtotal));
       
    }

}
