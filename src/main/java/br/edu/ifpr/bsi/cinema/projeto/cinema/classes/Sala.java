/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.cinema.projeto.cinema.classes;

/**
 *
 * @author igorc
 */
public class Sala {
    //Criação da classe sala:
    //atributos
    private int lugares;
    private int lugaresOcupados;
    private int numeroSala;
    
    //Construtor vazio
    public Sala() {
    }
    //Construtor Principal
    public Sala(int lugares, int numeroSala) {
        this.lugares = lugares;
        this.numeroSala = numeroSala;
    }
    
    //Getters e Setters
    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getLugaresOcupados() {
        return lugaresOcupados;
    }

    public void setLugaresOcupados(int lugaresOcupados) {
        this.lugaresOcupados = lugaresOcupados;
    }
    
    
}
