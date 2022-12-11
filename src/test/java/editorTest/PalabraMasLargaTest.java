package editorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;

class PalabraMasLargaTest {

	@Test
	void palabraMasLargaTest1() throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/documentoVacio.txt");
		assertNull(editor.palabraMasLarga());
	}

	@Test
	void palabraMasLargaTest4() throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/unaPalabra.txt");
		assertEquals("caca",editor.palabraMasLarga());
	}
	
	@Test
	void palabraMasLargaTest5() throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/palabraMasLarga5.txt");
		assertEquals("palabra",editor.palabraMasLarga());
	}
	
@Test
	void palabraMasLargaTest6() throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/palabraMasLarga6.txt");
		assertEquals("palabra",editor.palabraMasLarga());
	}
}
