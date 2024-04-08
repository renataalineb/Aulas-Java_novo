package quartoEQuinto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceListe {
    public static void main(String[] args) {

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Computador");
        listaArrayList.add("Teclado");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Carro");
        listaLinkedList.add("Avião");


        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);


        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
