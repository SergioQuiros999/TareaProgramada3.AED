package Collections;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase grafo permite generar los linkeos entre los v�rtices y las aristas
 *
 */
//UNE VERTICES Y ARISTAS
public class Grafo {

    public LinkedList<NodoVertice> vertices;
    //Lista de v�rtices del grafo

    //Constructor del grafo
    public Grafo() {
        this.vertices = new LinkedList<NodoVertice>();
    }

    //M�todo para agregar un v�rtice al grafo
    public void agregarVertice(String v) {
        vertices.add(new NodoVertice(v));  //Agrega el v�rtice al final de la lista de v�rtices
    }

    //M�todo para agregar una arista al grafo
    public void agregarArista(String origen, String destino, int peso, int tiempo) {
        buscarVertice(origen).aristas.add(new Nodo(destino, peso, tiempo));
        //Buscar el v�rtice origen y agrega un nodo al final de la lista de aristas de ese v�rtice
    }

    //M�todo para buscar un v�rtice en la lista de vertices del grafo seg�n el dato indicado
    public NodoVertice buscarVertice(String v) {
        //Recorre la lista de vertices
        for (int indice = 0; indice < this.vertices.size(); indice++) {
            if (this.vertices.get(indice).vertice == v) //Si encuentra el v�rtice lo retorna
            {
                return this.vertices.get(indice);
            }
        }
        return null;
    }

    //M�todo para buscar una arista en la lista de aristas
    public Nodo buscarArista(String origen, String destino) {
        NodoVertice temp = buscarVertice(origen);  //Busca el v�rtice de origen
        //Busca en la lista de aristas de ese v�rtice para identificar si se encuentra la arista buscada
        for (int i = 0; i < temp.aristas.size(); i++) {
            if (temp.aristas.get(i).vertice == destino) {
                return temp.aristas.get(i);
            }
        }
        return null;
    }

    //M�todo para buscar el primer v�rtice del grafo que est� sin visitar
    public NodoVertice buscarVerticeNOVisitado() {

        //Recorre la lista de v�rtices
        for (int indice = 0; indice < this.vertices.size(); indice++) {
            if (!this.vertices.get(indice).visitado) { //Si encuentra una no visitado lo retorna
                return this.vertices.get(indice);
            }
        }
        return null; //Si todos est�n visitados retorna null
    }

    //M�todo para imprimir el grafo recorriendo la lista de v�rtices y por cada v�rtice imprimiendo la lista de aristas que tiene
    public void imprimeGrafo() {
        NodoVertice actual;
        for (int i = 0; i < this.vertices.size(); i++) {
            actual = vertices.get(i);
            System.out.println("Vertice : " + actual.vertice);
            for (int j = 0; j < actual.aristas.size(); j++) {
                System.out.println("Arista de " + actual.vertice + " a " + actual.aristas.get(j).vertice + " con distancia " + actual.aristas.get(j).peso + "  metros y  " + "  tiempo entre lugares de  " + actual.aristas.get(j).tiempo + "  minutos");
            }
        }
    }

    public String getVerticebyindex(int index) {
        NodoVertice actual;
        String v = "";
        for (int i = 0; i < this.vertices.size(); i++) {
            if (index == i) {
                actual = vertices.get(i);
                v = actual.vertice;
                i = this.vertices.size();
            }
        }
        return v;
    }

    public int cantidadtotaldearistas() {
        NodoVertice actual;
        int a = 0;
        for (int i = 0; i < this.vertices.size(); i++) {
            actual = vertices.get(i);
            a = a + actual.aristas.size();

        }
        return a;
    }

    public String getAristasbyindex(int index) {
        NodoVertice actual;
        String a = "";
        for (int i = 0; i < this.vertices.size(); i++) {
            actual = vertices.get(i);

            for (int j = 0; j < actual.aristas.size(); j++) {

                a = actual.vertice + " a " + actual.aristas.get(j).vertice + " con distancia " + actual.aristas.get(j).peso + "  metros y  " + "  tiempo entre lugares de  " + actual.aristas.get(j).tiempo + "  minutos";
            }
        }
        return a;
    }

    //M�todo para inicializar todos los nodos como no visitados
    public void inicializarVisitados() {
        for (int i = 0; i < this.vertices.size(); i++) {
            this.vertices.get(i).visitado = false;
        }
    }

    //M�todo para verificar si todos los nodos del grafo est�n visitados
    public boolean todosVisitados() {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (!this.vertices.get(i).visitado) //Si encuentra uno sin visitar retorna false
            {
                return false;
            }
        }
        return true;	//Si encuentra uno visitado retorna true
    }

    //M�todo para eliminar un v�rtice del grafo
    public void eliminarVertice(String v) {
        this.vertices.remove(buscarVertice(v));  //Elimina el v�rtice de la lista de v�rtices
        //Elimina todas las aristas en las que el v�rtice eliminado aparezca como destino
        for (int i = 0; i < vertices.size(); i++) {
            eliminarArista(vertices.get(i).vertice, v);
        }
    }

    //M�todo para eliminar una arista de un v�rtice origen a un v�rtice destino dado
    public void eliminarArista(String origen, String destino) {
        //Verifica si el grafo es no dirigido
        if ((buscarArista(origen, destino) != null) && (buscarArista(destino, origen) != null)) { //Busca si existe arista de origen a destino y viceversa
            //Verifica si el peso de ambas aristas es igual con lo que se asume que es un grafo no dirigido
            if (buscarArista(origen, destino).peso == buscarArista(destino, origen).peso) {
                buscarVertice(destino).aristas.remove(buscarArista(destino, origen));
            }
        }
        //Elimina el arista de la lista de aristas del v�rtice origen
        buscarVertice(origen).aristas.remove(buscarArista(origen, destino));

    }

    //M�todo para realizar el recorrido en profundidad en el grafo
    public void recorridoProfundidad(String inicial) {
        inicializarVisitados();  //Inicializa todos los nodos como no visitados
        System.out.println("Recorrido en profundidad");
        DFS(inicial); //Hace la llamada al m�todo que realiza el algoritmo
        System.out.println();
    }

    private void DFS(String inicial) {

        NodoVertice actual = buscarVertice(inicial); //Busca el v�rtice inicial para el recorrido en la lista de v�rtices

        while (actual != null) //Ciclo para verificar que todos los v�rtices est�n visitados
        {
            //Si el nodo inicial no est� visitado
            if (!actual.visitado) {
                System.out.print(actual.vertice + " "); //Imprime el v�rtice
                actual.visitado = true;	//Lo actualiza como visitado
            }

            //Revisa todos los nodos adyacentes del nodo reci�n visitado
            for (int j = 0; j < actual.aristas.size(); j++) {
                if (!buscarVertice(actual.aristas.get(j).vertice).visitado) //Si el nodo adyacente no est� visitado
                {
                    DFS(actual.aristas.get(j).vertice); //Hace la llamada recursiva para realizar el recorrido en el nodo adyacente
                }
            }
            //Verifica si queda alg�n nodo sin visitar
            actual = buscarVerticeNOVisitado();
        }
    }

    //M�todo para recorrer el grafo en anchura
    public void recorridoAnchura(String inicial) {

        NodoVertice actual;
        LinkedList<NodoVertice> Cola = new LinkedList<NodoVertice>();	//Estructura auxiliar para hacer el recorrido

        inicializarVisitados(); //Inicializa todos los nodos como no visitados

        System.out.println("Recorrido en anchura");
        actual = buscarVertice(inicial); //Busca el v�rtice para iniciar el recorrido en la lista de v�rtices del grafo

        //Ciclo para verificar que todos los nodos est�n visitados
        while (actual != null) {
            //Si el nodo actual no ha sido visitado
            if (!actual.visitado) {
                System.out.print(actual.vertice + " "); //Imprime el v�rtice
                actual.visitado = true; //Indica que el v�rtice fue visitado
                Cola.add(actual);  //Agrega el v�rtice a la cola(estructura auxiliar)
            }
            //Busca todos los v�rtices adyacentes al v�rtice reci�n visitado
            for (int j = 0; j < actual.aristas.size(); j++) {
                if (!buscarVertice(actual.aristas.get(j).vertice).visitado) { //Si el v�rtice no se ha visitado aun
                    System.out.print(actual.aristas.get(j).vertice + " ");  //Se imprime el v�rtice
                    Cola.add(buscarVertice(actual.aristas.get(j).vertice));    //Se agrega el v�rtice a la cola
                    buscarVertice(actual.aristas.get(j).vertice).visitado = true;  //Se indica que el v�rtice ha sido visitado
                }
            }

            //Mientras la cola no est� vac�a
            while (Cola.size() > 0) {
                NodoVertice temp1;

                for (int x = 0; x < Cola.getFirst().aristas.size(); x++) {
                    //Obtiene el primer v�rtice en la cola
                    temp1 = buscarVertice(Cola.getFirst().aristas.get(x).vertice);
                    if (!temp1.visitado) {  //Verifica si el primero de la cola no ha sido visitado
                        System.out.print(temp1.vertice + " "); //Imprime el v�rtice
                        temp1.visitado = true;	//Indica que el v�rtice se ha visitado
                        Cola.add(temp1);	//Agrega el v�rtice al final de la cola
                    }
                }
                //Elimina el primer v�rtice de la cola
                Cola.removeFirst();
            }
            actual = buscarVerticeNOVisitado();//Verifica si aun quedan v�rtices sin visitar
        }
        System.out.println();
    }

}
