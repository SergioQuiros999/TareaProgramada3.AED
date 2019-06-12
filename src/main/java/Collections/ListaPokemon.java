/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import SYSTEM.*;
/**
 *
 * @author chech
 */
public class ListaPokemon {


    public class Node {

        //atributos

        public PokemonInfo element;
        public Node next;

        //Constructores
        public Node() {
            this.element = null;
            this.next = null;
        }

        public Node(PokemonInfo element) {
            this.element = element;
            this.next = null;
        }

        public Node(PokemonInfo element, Node next) {
            this.element = element;
            this.next = next;
        }

        //métodos

        public PokemonInfo getElement() {
            return this.element;
        }

        public void setElement(PokemonInfo element) {
            this.element = element;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    //atributos LinkedList
    public Node head;
    public Node current;
    public Node tail;
    public int position;
    public int size;

    //constructores LinkedList

    /**
     * Contructor predeterminado
     */
    public ListaPokemon() {
        this.head = new Node();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }

    public  ListaPokemon (ListaPokemon lista) {
        //completar
    }
    public void insertHead(PokemonInfo element){
        Node newNode = new Node(element);
        this.head=newNode;
        this.current=this.head;
        this.size++;
    }

    /**
     * Agrega un nuevo elemento a la lista
     * @param element El elemento a agregar
     */
    public void insert(PokemonInfo element) {
        //insertar en cualquier posición
        Node newNode = new Node(element, this.current.getNext());
        this.current.setNext(newNode);
        //necesario si se está insertando al final de la lista
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;

    }
     public Object getElement(){
        return this.current.getElement();
    }

    public int getSize() {
        return this.size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    

    public boolean next() {
        if (this.current == this.tail) {
            System.out.println("Actualmente en último nodo, no se puede avanzar");
            return false;
        }
        this.current = this.current.getNext();
        this.position++;
        return true;
    }

    public boolean previous() {
        if (this.current == this.head) {
            System.out.println("Actualmente en primer nodo, no se puede retroceder");
            return false;
        }
        Node temp = head;
        this.position = -1;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
            this.position++;
        }
        this.current = temp;
        return true;
    }

    public int getPosition() {
        return this.position;
    }

    public void goToStart(){
        this.current = this.head;
        this.position = - 1;
    }

    public void goToEnd(){
        this.current = this.tail;
        this.position = this.size - 1;
    }

    public void goToPos(int pos) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("Posición inválida");
            return;
        }
        if (pos > this.position) {
            while (pos > this.position) {
                this.next();
            }
        } else if (pos < this.position) {
            while (pos < this.position) {
                this.previous();
            }
        }
    }

    public int getPositionOfElement(Object element) {
        Node tempNode = this.head;
        int position = -1;
        while (tempNode != null) {
            if (tempNode.getElement() != null && tempNode.getElement().equals(element)){
                return position;
            }
            tempNode = tempNode.getNext();
            position++;
        }
        return -1;
    }

    /**
     * Devuelve la representación en String de la lista
     * @return un string representado la lista
     */
    public String toString() {
        Node currentNode = this.head.getNext();

        StringBuffer result = new StringBuffer();

        for (int i = 0; currentNode != null; i++)
        {
            if (i > 0)
            {
                result.append(",");
            }
            Object element = currentNode.getElement();

            result.append(element == null ? "" : element);
            currentNode = currentNode.getNext();
        }
        return result.toString();
    } 

        
    }

