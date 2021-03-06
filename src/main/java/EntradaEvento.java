/**
 * Una entrada que notifica un evento.
 * Las entradas tipo evento se crean a partir de un autor y un mensaje.
 *
 * @author Daniel Núñez Ricart
 * @version 1.0
 */
public class EntradaEvento extends Entrada{

    private String mensajeEvento;

    /**
     * Constructor de la clase.
     *
     * @param autor El autor de la entrada que se le pasa a la superclase Entrada.
     * @param mensaje   El mensaje del evento.
     */
    public EntradaEvento (String autor, String mensaje) {
        super(autor);
        mensajeEvento = mensaje;
    }

    /**
     * @return  El mensaje del evento.
     */
    public String getMensajeEvento() {
        return mensajeEvento;
    }

    /**
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        aDevolver += super.toString();
        aDevolver += "Evento: " + mensajeEvento + "\n";

        return aDevolver;
    }

    /**
     * Método que muestra por pantalla los detalles de la entrada, dependiendo del tipo de ésta.
     */
    public void mostrarDetallesPorPantalla() {
        System.out.println("Evento: " + mensajeEvento);
    }
}
