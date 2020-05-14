import java.util.ArrayList;

/**
 * Clase ComentariosEntrada, que contiene el atributo comentarios. Que no es más
 * que un ArrayList que guarda los comentarios de las entradas que los permiten.
 *
 * @author Daniel Núñez Ricart
 * @version 1.0
 */
public class EntradaComentarios extends Entrada{

    private ArrayList<String> comentarios;

    /**
     * Cosntructor de la clase EntradaComentarios.
     *
     * @param autor El autor de la entrada que se le pasa a la superclase.
     */
    public EntradaComentarios (String autor) {
        super(autor);
        comentarios = new ArrayList<>();
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
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        aDevolver += super.toString();
        aDevolver += getComentarios() + "\n";

        return aDevolver;
    }

}
