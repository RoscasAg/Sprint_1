package Tasca_2_Exceptions.Nivel_3_EJERCICIO_3;

import java.util.Objects;

public class Butaca {
    private int filas;
    private int asientos;
    private String persona;

    public Butaca(int filas, int asientos, String persona) {
        this.filas = filas;
        this.asientos = asientos;
        this.persona = persona;
    }

    public int filas() {
        return filas;
    }

    public int asientos(){
        return asientos;
    }

    public String persona(){
        return persona;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Butaca butaca = (Butaca) obj;
        return filas == butaca.filas && asientos == butaca.asientos && Objects.equals(persona, butaca.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filas, asientos, persona);
    }

    @Override
    public String toString() {
        return "Fila: " + filas + ", Asientos: " + asientos + ", Persona: " + persona;
    }

    public Object getPersona() {
        return persona;
    }

    public int getFila() {
        return filas();
    }

    public int getAsiento() {
        return asientos;
    }
}
