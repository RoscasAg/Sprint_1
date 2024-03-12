package Tasca_S1_02.Nivel_3_EJERCICIO_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionButacas {
    private ArrayList<Butaca> butacas;

    public GestionButacas() {
        this.butacas = new ArrayList<Butaca>();
    }

    public ArrayList<Butaca> getButacas() {

        return new ArrayList<>(butacas);
    }

    public void añadirButaca(Butaca nuevaButaca) throws ExcepcionesPersonalizadas.ExceptionButacaOcupada {
        if (buscarButaca(nuevaButaca.getFila(), nuevaButaca.getAsiento()) != -1){
            throw new ExcepcionesPersonalizadas.ExceptionButacaOcupada("Butaca ocupada");
        }
        butacas.add(nuevaButaca);
    }

    public void eliminarButaca(int fila, int asiento) throws ExcepcionesPersonalizadas.ExceptionAsientoLibre {
        int index = buscarButaca(fila, asiento);
        if (index == -1){
            throw new ExcepcionesPersonalizadas.ExceptionAsientoLibre("El asiento no está reservado");
        }
        butacas.remove(index);
    }

    public void eliminarReservaPersona(String persona) {
        Iterator<Butaca> iterator = butacas.iterator();
        while (iterator.hasNext()) {
            Butaca butaca = iterator.next();
            if (butaca.getPersona().equals(persona)) {
                iterator.remove();
            }
        }
    }

    public int buscarButaca(int fila, int asiento){
        for (int i = 0; i< butacas.size(); i++){
            Butaca butaca = butacas.get(i);
            if (butaca.getFila() == fila && butaca.getAsiento() == asiento) {
                return -1;
            }
        } return -1;
    }

}
