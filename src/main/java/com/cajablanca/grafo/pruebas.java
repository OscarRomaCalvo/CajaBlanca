package com.cajablanca.grafo;

public class pruebas {
	public static void main (String[] Args) {
		
		Grafo g= new Grafo("resources/Grafo/nuevo.txt");
		g.kruskal().printGraph();
	}
}
