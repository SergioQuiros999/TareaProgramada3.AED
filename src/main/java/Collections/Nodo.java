/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author Fanny Brenes
 */
public class Nodo {
    public String vertice;		//Almacena en dato del v�rtice
 	public int peso;
        public int tiempo;//Almacena el peso de la arista

	//Constructor de nodo vac�o
 	public Nodo(){
		this.vertice = "";
		this.peso = 0;
	}//fin del constructor Nodo


	//Constructor de nodo con el dato del v�rtice destino y el peso de la arista
	public Nodo(String v, int p){
		this.vertice = v;
		this.peso = p;
	}
        public Nodo(String v, int p,int tiempo){
		this.vertice = v;
		this.peso = p;
                this.tiempo=tiempo;
	}

	public String aCadena(){
		return "|" + this.vertice + "|" + this.peso + "|->";
	}//fin m�todo aCadena
}
