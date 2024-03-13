package Tasca_S1_03.Nivel_1_EJERCICIO_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        //creo la primera lista
        List<Integer> primeraLista = new ArrayList<>();
        primeraLista.add(1);
        primeraLista.add(2);
        primeraLista.add(3);
        primeraLista.add(4);
        primeraLista.add(5);

        //creo la segunda lista
        List<Integer> segundaLista = new ArrayList<>();

        // creo un ListIterator para cambiar el orden de la lista 1
        //busco los objetos Listiterator para leer los elementos de la primera lista
        // para insertarlos en la segunda lista
        ListIterator<Integer> iterator = primeraLista.listIterator(primeraLista.size());
        while (iterator.hasPrevious()){
            segundaLista.add(iterator.previous());
        }
        //muestro la segunda lista para verfiricar que el orden está invertido
        System.out.println("Segunda lista en orden inverso de la primera lista");
        for (Integer num : segundaLista){
            System.out.println(num);
        }
    }
}

