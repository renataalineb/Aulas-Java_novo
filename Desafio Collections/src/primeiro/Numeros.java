package primeiro;

import java.util.ArrayList;
import java.util.Collections;

public class Numeros {
    public static void main(String[] args) {

        ArrayList<Integer>numInteiros = new ArrayList<>();

        numInteiros.add(40);
        numInteiros.add(95);
        numInteiros.add(54);
        numInteiros.add(23);
        numInteiros.add(18);
        numInteiros.add(3);

        Collections.sort(numInteiros);

        System.out.println(numInteiros);



    }
}
