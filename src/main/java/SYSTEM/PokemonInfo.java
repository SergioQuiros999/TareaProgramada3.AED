package SYSTEM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chech
 */
public class PokemonInfo {

    
    //ATRIBUTOS DE LOS POKEMON
    String Especie;
    String Nombre;
    int Ataque;
    int Defensa;
    int Velocidad;
    String AtaqueEspecial;
    String DefensaEspecial;
    String Preevolucion;
    String PosibleEvolucion;
    String Padre;
    String Hijos;
    int CantidadDeVehiculos=0;

    
    //CONSTRUCTOR DE LA CLASE//
    
    public PokemonInfo(String Especie, String Nombre, int Ataque, int Defensa, int Velocidad, String AtaqueEspecial, String DefensaEspecial, String Preevolucion, String PosibleEvolucion, String Padre, String Hijos, int CantidadDeVehiculos) {
        this.Especie = Especie;
        this.Nombre = Nombre;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.Velocidad = Velocidad;
        this.AtaqueEspecial = AtaqueEspecial;
        this.DefensaEspecial = DefensaEspecial;
        this.Preevolucion = Preevolucion;
        this.PosibleEvolucion = PosibleEvolucion;
        this.Padre = Padre;
        this.Hijos = Hijos;
        this.CantidadDeVehiculos = CantidadDeVehiculos;
       
    }

    
    //SETTERS AND GETTERS

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public String getAtaqueEspecial() {
        return AtaqueEspecial;
    }

    public void setAtaqueEspecial(String AtaqueEspecial) {
        this.AtaqueEspecial = AtaqueEspecial;
    }

    public String getDefensaEspecial() {
        return DefensaEspecial;
    }

    public void setDefensaEspecial(String DefensaEspecial) {
        this.DefensaEspecial = DefensaEspecial;
    }

    public String getPreevolucion() {
        return Preevolucion;
    }

    public void setPreevolucion(String Preevolucion) {
        this.Preevolucion = Preevolucion;
    }

    public String getPosibleEvolucion() {
        return PosibleEvolucion;
    }

    public void setPosibleEvolucion(String PosibleEvolucion) {
        this.PosibleEvolucion = PosibleEvolucion;
    }

    public String getPadre() {
        return Padre;
    }

    public void setPadre(String Padre) {
        this.Padre = Padre;
    }

    public String getHijos() {
        return Hijos;
    }

    public void setHijos(String Hijos) {
        this.Hijos = Hijos;
    }

    public int getCantidadDeVehiculos() {
        return CantidadDeVehiculos;
    }

    public void setCantidadDeVehiculos(int CantidadDeVehiculos) {
        this.CantidadDeVehiculos = CantidadDeVehiculos;
    }
    
    
    
    }

    
    
