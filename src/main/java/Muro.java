import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro {

    // Atributos
    private ArrayList <Entrada> entradas;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro () {
        entradas = new ArrayList<>();
    }

    /**
     * Anade una entrada al muro.
     * @param entrada La entrada a anadir.
     */
    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n\n";
        }

        return aDevolver;
    }

    public void mostrarDetallesTodasLasEntradas() {

        for (Entrada entrada : entradas) {
            entrada.mostrarDetallesPorPantalla();
        }
    }

    /**
     * Método que muestra por pantalla y devuelve todas las urls de las EntradaFoto.
     * Si no hay objetos del tipo EntradaFoto devuelve el mensaje: "No hay entradas
     * de tipo foto.", y también lo muestra por pantalla.
     *
     * @return  Un array con todas las urls de las EntradaFoto
     */
    public String[] getUrlsFotos() {

        String[] urls;

        boolean detector = false;

        ArrayList<EntradaFoto> listaEntradasFoto = new ArrayList<>();

        for (Entrada entrada : entradas) {
            if (entrada instanceof EntradaFoto) {
                detector = true;
                listaEntradasFoto.add((EntradaFoto) entrada);
            }
        }

        if (detector) {
            urls = new String[listaEntradasFoto.size()];

            for (int i = 0; i < listaEntradasFoto.size(); i++) {
                urls[i] = listaEntradasFoto.get(i).getUrlImagen();
            }

            String listaUrls = "";

            for (int i = 0; i < urls.length; i++) {
                listaUrls += "Url: " + urls[i] + "\n";
            }

            System.out.println(listaUrls);
        } else {
            urls = new String[1];
            urls[0] = "No hay entradas de tipo foto.";
            System.out.println(urls[0]);
        }

        return urls;
    }
}

