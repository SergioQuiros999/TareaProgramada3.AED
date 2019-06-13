package SYSTEM;

import Collections.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chech
 */
public class Manager {
    
    ListaPokemon listaPokes = new ListaPokemon();

    public Manager() {
    }

    public ListaPokemon getListaPokemon() {
        return listaPokes;
    }

    public void setListaPokemon(ListaPokemon listaPokemones) {
        this.listaPokes = listaPokemones;
    }
    //METODOS RELACIONADOS CON LOS VEHICULOS
//Insertar Vehiculos.
     public void insertarPokemon(PokemonInfo pokemon)
    {
       int contador = 0;
       
       if (listaPokes.getSize() == 0){
         listaPokes.insertHead(pokemon);
         System.out.println("insertado primero"); 
           
      }
       else{
           listaPokes.goToStart(); //posiciona al current en el inicio de la lista
          
           PokemonInfo comparar= listaPokes.getCurrent().getElement(); //consigue el elemento que se encuentra dentro del current
           
           while(contador <= listaPokes.getSize()){ 
               System.out.println("Nuevo: "+pokemon.getEspecie());
               System.out.println("Comparado: "+comparar.getEspecie());
               System.out.println("----------------------------------");
               
               if (pokemon.getEspecie()==comparar.getEspecie()){ //se busca si el modelo que se quiere agregar ya se enuentra en la lista
                    
                   pokemon.Existentes+=1;     //si el modelo ya existe se le agreca uno a esa cantidad
                    System.out.println("aumentado");
                    System.out.println(comparar.getExistentes());
                    break;
                }
                else{
                    if(listaPokes.getCurrent().getNext()==null){
                        System.out.println("No hay siguiente");
                        listaPokes.insert(pokemon);
                        break;
                    }
                    else{
                        comparar=listaPokes.getCurrent().getNext().getElement(); //se sigue comparando para que si se encuentra
                        listaPokes.setCurrent(listaPokes.getCurrent().getNext());
                        System.out.println("Nuevo comparado: "+comparar.getEspecie());
                    }
                    
                } 
               System.out.println(contador);
               System.out.println(listaPokes.getSize());
                contador++; 
            }
        
        
       }
     
      
    }
}
