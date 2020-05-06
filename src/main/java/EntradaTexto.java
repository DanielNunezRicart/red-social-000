/**
 * Una entrada con texto
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 *  @author DAM
 *  @version 1.0
 */

public class EntradaTexto extends ComentariosEntrada{
    // Contenido de la entrada.
    private String mensaje;

    /**
     * Constructor - Construye entradas a partir de un autor y un contenido.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     *
     * @param autor Autor de la entrada.
     * @param texto Contenido de la entrada.
     */
    public EntradaTexto (String autor, String texto) {
        super(autor);
        mensaje = texto;
    }

    /**
     * @return Devuelve el contenido de la entrada.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getMeGusta() + "\n";
        aDevolver += mensaje + "\n";
        aDevolver += getTiempo() + "\n";
        aDevolver += getComentarios() + "\n";

        return aDevolver;
    }

    /**
     * Método que muestra por pantalla el autor y el mensaje de una WntradaTexto en el siguiente formato:
     * Autor: Luis
     * Mensaje: Hola mundo!
     */
    public void mostrarAutorYMensaje() {
        String aDevolver = "Autor: " + getUsuario() + "\n" + "Mensaje: " + mensaje;
        System.out.println(aDevolver);
    }
}