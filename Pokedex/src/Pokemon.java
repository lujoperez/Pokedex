import java.util.ArrayList;

public class Pokemon {
    //Atributos
    private String nombre;
   private Integer numeroPokedex;
    private String tipo1;
    private String tipo2;

    //Constructores:
    public Pokemon() {
    }

    public Pokemon(String nombre, Integer numeroPokedex, String tipo1, String tipo2) {
        this.nombre = nombre;
        this.numeroPokedex = numeroPokedex;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }


    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(Integer numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    //ToString
    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", numeroPokedex=" + numeroPokedex +
                ", tipo1='" + tipo1 + '\'' +
                ", tipo2='" + tipo2 + '\'' +
                '}';
    }



    //Métodos:

    public String presentacion () {
        return "nombre: " + nombre  + " numero: " + numeroPokedex + " tipo: " + tipo1 + ", "+ tipo2;
    }

    public String atacar () {
        return nombre + "realizo un ataque exitoso";

    }


}
