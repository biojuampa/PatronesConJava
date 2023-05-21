import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Integer[] numeros = {0,1,2,3,4};
        int sumatoria = suma.apply(new ArrayList<Integer>(Arrays.asList(numeros)));
        System.out.println(sumatoria);
    }

    private static Function<ArrayList<Integer>, Integer> suma = arr -> arr.stream().reduce(0, (x,y) -> x+y);
}
