package editorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;

class SustituirPalabraTest {

	@Test
	void sustituirPalabraTest1() {
		Editor editor = new Editor();
		editor.cargarEditor("resources/documentoVacio.txt");
		editor.sustituirPalabra("Hola", "Adios");
		assertFalse(editor.existePalabra("Adios"));
	}
	
	
	@Test
	void sustituirPalabraTest4() {
		Editor editor = new Editor();
		editor.cargarEditor("resources/unaPalabra.txt");
		editor.sustituirPalabra("Hola", "Adios");
		assertFalse(editor.existePalabra("Adios"));
	}

	@Test
	void sustituirPalabraTest5() {
		Editor editor = new Editor();
		editor.cargarEditor("resources/unaPalabra.txt");
		editor.sustituirPalabra("caca", "Adios");
		assertTrue(editor.existePalabra("Adios"));
	}
}
