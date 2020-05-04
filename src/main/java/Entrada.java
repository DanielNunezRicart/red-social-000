import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * Clase Entrada que contendrá los atributos comunes de las
 * entradas de tipo texto y las de tipo imagen. Actuará como una clase padre o
 * superclase para las clases EntradaTexto y EntradaFoto.
 *
 * @author Daniel Núñez Ricart
 * @version 1.0
 */
public class Entrada {

    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    /**
     * Constructor de la clase Entrada. Sólo se pide el nombre del autor, al resto de atributos se
     * les da un valor inicial, con la excepción del ArrayList comentarios que simplemente se inicializará.
     * A momentoPublicacion se le dará el valor de la fecha actual y a cantidadMeGusta el valor 0.
     *
     * @param autor El nombre del autor de la entrada.
     */
    public Entrada (String autor) {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
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
     * @return  String que contiene los comentarios de la entrada o "No hay comentarios" si no los tiene.
     */
    public String getComentarios () {
        String textoADevolver = "";

        if (comentarios.isEmpty()) {
            textoADevolver = "No hay comentarios";
        } else {
            for (String comentario : comentarios) {
                textoADevolver += "Comentarios: \n";
                textoADevolver += "+ " + comentario + "\n";
            }
        }

        return textoADevolver;
    }

    /**
     * Método que añade el comentario pasado como parámetro al ArrayList comentarios.
     *
     * @param comentario    El comentario que queremos añadir a la entrada.
     */
    public void addComentario(String comentario) {
        comentarios.add(comentario);
    }

    /**
     * @return  String que contiene el tiempo exacto que ha pasado desde que se ha publicado la entrada.
     */
    public String getTiempo() {
        return "Escrito hace 10 segundos";
    }

    @Override
    public String toString() {
        return "";
    }

}
