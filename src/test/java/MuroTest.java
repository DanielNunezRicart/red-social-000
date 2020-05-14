import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Juan", "Juan se ha unido al grupo");
        EntradaEvento entrada06 = new EntradaEvento("Pedro", "¡Pedro y Juan ahora son amigos!");

        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada05);
        muro.addEntrada(entrada06);

        System.out.println(muro);

        String resultadoEsperado = "Usuario: Nacho\nEscrito hace 10 segundos\nLikes: 0\nNo hay comentarios\nRecién llegado de mis vacaciones en Hawai!\n\n\n";
        resultadoEsperado += "Usuario: Luis\nEscrito hace 10 segundos\nLikes: 0\nNo hay comentarios\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\n\n\n";
        resultadoEsperado += "Usuario: Begoña\nEscrito hace 10 segundos\nLikes: 0\nNo hay comentarios\nEstá lloviendo ahí fuera...\n\n\n";
        resultadoEsperado += "Usuario: Cristina\nEscrito hace 10 segundos\nLikes: 0\nNo hay comentarios\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\n\n\n";
        resultadoEsperado += "Usuario: Juan\nEscrito hace 10 segundos\nLikes: 0\nEvento: Juan se ha unido al grupo\n\n\n";
        resultadoEsperado += "Usuario: Pedro\nEscrito hace 10 segundos\nLikes: 0\nEvento: ¡Pedro y Juan ahora son amigos!\n\n\n";

        assertEquals(resultadoEsperado, muro.toString());
    }

    @Test
    public void test02() {
        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Juan", "Juan se ha unido al grupo");
        EntradaEvento entrada06 = new EntradaEvento("Pedro", "¡Pedro y Juan ahora son amigos!");

        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada05);
        muro.addEntrada(entrada06);

        muro.mostrarDetallesTodasLasEntradas();
    }
}
