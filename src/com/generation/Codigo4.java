package com.generation;

import java.util.Scanner; //Se importa la libreria de Scanner

public class Codigo4 {
	/*Basicamente lo que hace el  programa es simular un juego de piedra, papel o tijera y al final te muestra el jugador
	 * ganador y si ambos jugadores tiran el mismo valor, te indica que es un empate */

	public static void main(String[] args) { //Se coloca un método main, para poder ejecutarlo
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	  //  Scanner s2 = new Scanner(System.in); se quita esta opció ya que con el primerer Scanner es funcional
	    String j2 = s.nextLine();
	    
	  /*Se elimina un parentesis de más y se quita el == y se coloca equals, ya que al ejecutarse siendo ambas palabras 
	   * iguales, no entraba en el if de empate, y te mandaba a algun caso, igual forma se modifica el caso piedra con 
	   * equals y se agrega un else if, ya que al hacer pruebas mandaba que ganaba un jugador, cuando en realidad, ganaba
	   * el otro jugador*/
	    if (j1.equals(j2)) { 
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	      
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          } else if (j2.equals("papel")) {
	        	  g = 2;
	          }
	          break; //Se agrega el break en cada uno de los casos faltantes
	          
	        case "papel":
	        	if (j2.equals("piedra")) {
		            g = 1;
		          } else if (j2.equals("tijeras")) {
		        	  g = 2;
		          } //Se agrega el parentesis faltante
	          break;
	          
	        case "tijera":
	        	if (j2.equals("papel")) {
		            g = 1;
		          } else if (j2.equals("piedra")) {
		        	  g = 2;
		          }
	          break;
	          
	        default:
	      } // switch 
	      System.out.println("Gana el jugador " + g);
	    }
	}

}
