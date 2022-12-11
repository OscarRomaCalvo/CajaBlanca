package com.cajablanca.editor;

import java.util.ArrayList;
import java.util.Iterator;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;

public class prueba {
	public static void main (String[] args) throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/lineaVacia.txt");
		int numPalabras = 0;
		int tamanio = editor.size();
		int i;
		AbstractSingleLinkedListImpl<String> lista = null;
		if (tamanio > 0) {
			i = 1;
			while (i <= tamanio) {
				lista = editor.getLinea(i);
				for (String s : lista) {
					System.out.println("HOLA");
					if(s.length()>0)
						numPalabras++;
				}
				i++;
			}
		}
		System.out.println(numPalabras);
	}
}
