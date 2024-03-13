package Tasca_S1_03.Nivel_1_EJERCICIO_1;

import java.util.ArrayList;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month{" + "name='" + name + '\'' + '}';
    }
}
