package com.cajablanca.editor;

import java.util.ArrayList;
import java.util.Iterator;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;

public class prueba {
	public static void main (String[] args) throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/practica.txt");
		AbstractSingleLinkedListImpl<String> lista = editor.getLinea(1);
		boolean iguales = true;
		ArrayList aux = new ArrayList();
		aux.add("Hola");
		int i=0;
		Iterator iterator = lista.iterator();
		String a=null;
		while(iterator.hasNext()) {
			a=(String) iterator.next();
			System.out.println(a);
		}
	}
}
