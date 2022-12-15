package editorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;

class ExistePalabraTest {

	@Test
	void existePalabraTest1() {
		Editor editor = new Editor();
		assertFalse(editor.existePalabra("Melocoton"));
	}

	@Test
	void existePalabraTest4() {
		Editor editor = new Editor();
		editor.cargarEditor("resources/unaPalabra.txt");
		assertFalse(editor.existePalabra("Melocoton"));
	}
	
	@Test
	void existePalabraTest5() {
		Editor editor = new Editor();
		editor.cargarEditor("resources/unaPalabra.txt");
		assertTrue(editor.existePalabra("caca"));
	}
}
