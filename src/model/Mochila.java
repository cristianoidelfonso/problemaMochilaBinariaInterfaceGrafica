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
public class Mochila {
    
    private int id;
    private float capacidade;
    private Individuo individuo;

    public Mochila() {
    }

    public Mochila(int id) {
        this.id = id;
    }

    public Mochila(float capacidade) {
        this.capacidade = capacidade;
    }

    public Individuo getIndividuo() {
        return individuo;
    }

    public void setIndividuo(Individuo individuo) {
        this.individuo = individuo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    } 
}
