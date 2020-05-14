import java.time.LocalDateTime;

/**
 * Clase Entrada que contendrá los atributos comunes de las
 * entradas de tipo texto, tipo imagen y tipo evento. Actuará como una clase padre o
 * superclase para las clases ComentariosEntrada y EntradaEvento.
 *
 * @author Daniel Núñez Ricart
 * @version 1.2
 */
public class Entrada {

    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;

    /**
     * Constructor de la clase Entrada. Sólo se pide el nombre del autor, al resto de atributos se
     * les da un valor inicial. A momentoPublicacion se le dará el valor de la fecha actual
     * y a cantidadMeGusta el valor 0.
     *
     * @param autor El nombre del autor de la entrada.
     */
    public Entrada (String autor) {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }

    /**
     * @return  String que contiene el nombre del usuario que ha creado la entrada.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Método que incrementa en 1 la cantidad de "me gusta" que tiene la entrada.
     */
    public void meGusta() {
        cantidadMeGusta++;
    }

    /**
     * @return  int que contiene la cantidad de "me gusta" que tiene una entrada.
     */
    public int getMeGusta() {
        return cantidadMeGusta;
    }

    /**
     * @return  LocalDateTime que contiene el momento exacto en el que se publicó la entrada.
     */
    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }

    /**
     * @return  String que contiene el tiempo exacto que ha pasado desde que se ha publicado la entrada.
     */
    public String getTiempo() {
        return "Escrito hace 10 segundos";
    }

    /**
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    public String toString() {
        String aDevolver = "";

        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += getTiempo() + "\n";
        aDevolver += "Likes: " + getMeGusta() + "\n";

        return aDevolver;
    }

    public void mostrarDetallesPorPantalla() {
    }
}
