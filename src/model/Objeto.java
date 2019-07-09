/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Idelfonso
 */
public class Objeto {
    
    private int id;
    private float peso;
    private float valor;

    public Objeto() {
    }

    public Objeto(int id, float valor, float peso) {
        this.id = id;
        this.valor = valor;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    public void println(){
        System.out.println("Objeto : " + this.getId()  + "-->  " +   
                           "Peso : " + this.getPeso() + "   |   " + 
                           "Valor: " + this.getValor()
        );
    }
    
}
