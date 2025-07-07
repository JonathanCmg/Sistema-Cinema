/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.cinema.projeto.cinema.controller;

import br.edu.ifpr.bsi.cinema.projeto.cinema.model.Filme;
import br.edu.ifpr.bsi.cinema.projeto.cinema.model.Sala;
import java.util.ArrayList;

/**
 *
 * @author Jonat
 */
public class ControleCadastros {
    ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
    ArrayList<Sala> listaSalas = new ArrayList<Sala>();

    public ControleCadastros() {
    }

    
    
    public ControleCadastros(ArrayList<Filme> listaFilmes,ArrayList<Sala> listaSalas) {
        this.listaFilmes = listaFilmes;
        this.listaSalas = listaSalas;
    }
    
    
    
    
    public void CadastrarFilme(String nome, float duracao, String diretor, String atorPrincipal, String Papel){
        Filme filme = new Filme(nome,duracao,diretor,atorPrincipal,Papel);
        listaFilmes.add(filme);
        System.out.println(listaFilmes);
    }
    
    public void CadastrarSala(int lugares, int lugaresOcupados, int id){
        Sala sala = new Sala(lugares, lugaresOcupados, id);
        listaSalas.add(sala);
        System.out.println(listaSalas);
    }
    
}
