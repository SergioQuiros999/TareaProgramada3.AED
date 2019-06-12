/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.LinkedList;

/**
 *
 * @author Fanny Brenes
 */
public class NodoVertice {
        public String vertice;					//Almacena el dato del v�rtice
 	public boolean visitado;			//Indica si el v�rtice ha sido visitado o no
 	public LinkedList <Nodo> aristas;	//Almacena la lista de aristas del v�rtice
        
 	public NodoVertice(){
		this.vertice = "";
		this.visitado = false;
		this.aristas  = new LinkedList<Nodo>();
	}//fin del constructor Nodo

	public NodoVertice(String v){
			this.vertice = v;
			this.visitado = false;
			this.aristas  = new LinkedList<Nodo>();
	}//fin del constructor Nodo

	public String aCadena(){
		return "|" + this.vertice + "|" + "|->";
	}//fin m�todo aCadena

}
