package cadena;

import static org.junit.Assert.*;

import org.junit.Test;

public class cadenatest {

	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.Test;

import cadenapac.Cadena;

	public class cadenatest {

	    @Test
	    public void testLongitud() {
	        Cadena cadena = new Cadena();
	        String texto = "Hola mundo";
	        int longitud = cadena.longitud(texto);
	        assertEquals(10, longitud, "Longitud incorrecta");
	        assertEquals(0, cadena.longitud(""), "Longitud de cadena vacía incorrecta");
	    }

	    @Test
	    public void testVocales() {
	        Cadena cadena = new Cadena();
	        String texto = "Hola mundo";
	        int numVocales = cadena.vocales(texto);
	        assertEquals(4, numVocales, "Número de vocales incorrecto");
	        assertEquals(0, cadena.vocales(""), "Número de vocales vacías");
	    }

	    @Test
	    public void testInvertir() {
	        Cadena cadena = new Cadena();
	        String texto = "Hola mundo";
	        String invertida = cadena.invertir(texto);
	        assertEquals("odnum aloH", invertida, "incorrecta");
	        assertEquals("", cadena.invertir(""), "incorrecta");
	    }

	    @Test
	    public void testContarLetra() {
	        Cadena cadena = new Cadena();
	        String texto = "Hola mundo";
	        int numLetras = cadena.contarLetra(texto, 'o');
	        assertEquals(2, numLetras, "Número de letras incorrecto");
	        assertEquals(0, cadena.contarLetra("", 'o'), "Número de letras incorrecto");
	    }
	

	}

