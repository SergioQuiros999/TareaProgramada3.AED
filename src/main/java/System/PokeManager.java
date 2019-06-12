/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Collections.ControladorGrafo;
import Collections.Dijkstra;
import Collections.Grafo;
import Collections.Grafo_1;
import Collections.SimpleLinkeList;
import Collections.Vertice;
import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author samoy
 */
public class PokeManager {

    Grafo lugares = new Grafo();
    
    ControladorGrafo lugar=new ControladorGrafo();
    List<Busqueda> busqueda = new SimpleLinkeList<>();
    List<Busqueda> lugarespreterminados = new SimpleLinkeList<>();
    List<String> aristas= new SimpleLinkeList<>();

    public static final PokeManager instance;

    public static PokeManager getInstance() {
        return instance;
    }

    static {
        instance = new PokeManager();
        Busqueda busqueda=new Busqueda();
         Busqueda busqueda1=new Busqueda();
          Busqueda busqueda2=new Busqueda();
           Busqueda busqueda3=new Busqueda();
            Busqueda busqueda4=new Busqueda();
        busqueda.setName("Tienda Pokemon");
        busqueda.setDireccion("por definir");
        busqueda.setX("50");
        busqueda.setY("70");
        busqueda.setDireccion("Se encuentra al inicio del mapa ");
        instance.lugarespreterminados.add(busqueda);
        busqueda1.setName("Gimnasio Pokemon");
        busqueda1.setDireccion("por definir");
        busqueda1.setX("400");
        busqueda1.setY("70");
         busqueda1.setDireccion("Se encuentra 350 mts después de la tienda sobre la cordenada x");
        instance.lugarespreterminados.add(busqueda1);
         busqueda2.setName("Hospital Pokemon");
        busqueda2.setDireccion("por definir");
        busqueda2.setX("330");
        busqueda2.setY("330");
         busqueda2.setDireccion("Se encuentra 260 msts despues de la tienda y 280 al sur ");
        instance.lugarespreterminados.add(busqueda2);
         busqueda3.setName("Punto de Captura");
        busqueda3.setDireccion("por definir");
        busqueda3.setX("680");
        busqueda3.setY("230");
         busqueda3.setDireccion("Se encuentra 630 msts despues de la tienda y 210 al sur ");
        instance.lugarespreterminados.add(busqueda3);
         busqueda4.setName("Restaurante Pokemon");
        busqueda4.setDireccion("por definir");
        busqueda4.setX("50");
        busqueda4.setY("490");
         busqueda4.setDireccion("Se encuentra 420 msts al sur de la tienda");
        instance.lugarespreterminados.add(busqueda4);
        
        instance.lugares.agregarVertice("Hospital Pokemon");
        instance.lugares.agregarVertice("Gimnasio Pokemon");
        instance.lugares.agregarVertice("Tienda Pokemon");
        instance.lugares.agregarVertice("Restaurante Pokemon");
        instance.lugares.agregarVertice("Punto de Captura");
        instance.lugar.nuevoVertice("Hospital Pokemon",".");
        instance.lugar.nuevoVertice("Gimnasio Pokemon",".");
        instance.lugar.nuevoVertice("Tienda Pokemon",".");
        instance.lugar.nuevoVertice("Restaurante Pokemon",".");
        instance.lugar.nuevoVertice("Punto de Captura",".");
      
        }
    public void AddBusqueda(Busqueda item){
    busqueda.add(item);
    }
    public List<Busqueda> GetBusquedaa(){
    return busqueda;
    }
    public List<Busqueda> GetLugarespreterminados(){
    return lugarespreterminados;
    }
    public void RemoveBusqueda(int item){
    busqueda.remove(item);
    }
    public void AddArista(String item){
    aristas.add(item);
    }
    public List<String> GetArista(){
    return aristas;
    }
    
    public void RemoveArista(int item){
    aristas.remove(item);
    }
    public Busqueda GetBusqueda(int item){
    return busqueda.get(item);
    }
    public Busqueda GetPreterminado(int item){
    return lugarespreterminados.get(item);
    }
    
    public void Addplace(String vertice){
    lugares.agregarVertice(vertice);
    lugar.nuevoVertice(vertice, ".");
    }
    public void Removeplace(String vertice){
    lugares.eliminarVertice(vertice);
    }
    public void Addroad(String origen,String destino,int distancia,int tiempo){
    lugares.agregarArista(origen, destino, distancia,tiempo);
    int size=lugar.getVertices().size();
    int x=0;
    int y=0;
    for(int i=0;i<size;i++){
    if(lugar.getVertices().get(i).getId()==origen){
    x=i;
    }
    if(lugar.getVertices().get(i).getId()==destino){
    y=i;
    }}
    lugar.nuevaArista(origen, x, y, distancia);
    }
    public void Removeroad(String origen,String destino){
    lugares.eliminarArista(origen, destino);
    }
    public String GetRoads(){
    return lugares.getAristasbyindex(0);
    }
    public String GetPlace(String place){
    return lugares.buscarVertice(place).vertice;
    }
    public String GetPlacebyint(int place){
    return lugares.getVerticebyindex(place);
    }
    public String Djikstra(String origen,String Destino){
    Grafo_1 grafo = new Grafo_1(lugar.getVertices(), lugar.getAristas());
    Dijkstra shortestRoute = new Dijkstra(grafo);
    int size=lugar.getVertices().size();
    int x=0;
    int y=0;
    for(int i=0;i<size;i++){
    if(lugar.getVertices().get(i).getId()==origen){
    x=i;
    }
    if(lugar.getVertices().get(i).getId()==Destino){
    y=i;
    }}
    shortestRoute.ejecutarGrafo(shortestRoute.getVertices().get(x));
    LinkedList<Vertice<Object>> p =shortestRoute.obtenerListadoCamino(shortestRoute.getVertices().get(y));
    String camino=p.toString();
    return camino;
    }
       

}
