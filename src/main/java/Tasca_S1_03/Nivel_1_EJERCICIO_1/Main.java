package Tasca_S1_03.Nivel_1_EJERCICIO_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));

        System.out.println("Calendario " + months);

        months.add(7, new Month("Agost"));

        System.out.println("ArrayList ordenado");
        for (Month month : months){
            System.out.println(month);
        }

        // Cuando se convierte un ArrayList en un HashSet el orden de los elementos
        // puede cambiar ya que HashSet no mantiene un orden de los elementos
        HashSet<Month> monthsSet = new HashSet<>(months);
        System.out.println("HashSet (Sin duplicados)");
        for (Month month : monthsSet){
            System.out.println(month);
        }


        System.out.println("Recorrido con un Iterador");
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
