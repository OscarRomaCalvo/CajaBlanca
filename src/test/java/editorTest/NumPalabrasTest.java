package editorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;

class NumPalabrasTest {

	@Test
	void numPalabrasTest1() {
		Editor editor = new Editor();
		assertThrows(EmptyCollectionException.class, () -> editor.numPalabras());
	}

	@Test
	void numPalabrasTest5() throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/lineaVacia.txt");
		assertEquals(0,editor.numPalabras());
	}
	
	@Test
	void numPalabrasTest6() throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/unaPalabra.txt");
		assertEquals(1,editor.numPalabras());
	}
}
