import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro
{
    // Entradas de texto
    private ArrayList <EntradaTexto> mensajes;
    // Entradas con imagenes
    private ArrayList <EntradaFoto> fotos;
    // Entradas de eventos
    private ArrayList <EntradaEvento> eventos;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicializa mensajes y fotos.
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    /**
     * Anade una entrada de texto al muro.
     * @param entrada La entrada de texto a anadir.
     */
    public void addEntradaTexto(EntradaTexto entrada) {
        mensajes.add(entrada);
    }

    /**
     * Anade una entrada de imagen al muro.
     * @param entradaFoto La entrada de imagen a anadir.
     */
    public void addEntradaFoto(EntradaFoto entradaFoto) {
        fotos.add(entradaFoto);
    }

    /**
     * Añade una entrada de tipo evento al muro.
     *
     * @param entradaEvento La entrada de evento a añadir.
     */
    public void addEntradaEvento (EntradaEvento entradaEvento) {
        eventos.add(entradaEvento);
    }

    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        // Buscamos todas las entradas de texto.
        for (EntradaTexto entrada : mensajes) {
            aDevolver += entrada + "\n\n";
        }

        // Buscamos todas las entradas con foto.
        for (EntradaFoto entrada : fotos) {
            aDevolver += entrada + "\n\n";
        }

        // Ahora las entradas de tipo evento.
        for (EntradaEvento entrada : eventos) {
            aDevolver += entrada + "\n\n";
        }

        return aDevolver;
    }
}

