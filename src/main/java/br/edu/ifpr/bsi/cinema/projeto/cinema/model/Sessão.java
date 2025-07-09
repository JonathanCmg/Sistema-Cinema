/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.cinema.projeto.cinema.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Jonat
 */
public class Sessão extends Filme {
        private Sala sala;
        ArrayList<Filme> ListaSessao = new ArrayList<>();
        LocalTime inicioSessao;
        
    
    public Sessão(int lugares,int lugaresOcupados,int numeroDaSala, LocalTime inicioSessao){
        this.sala = new Sala(lugares,lugaresOcupados,numeroDaSala);
        this.inicioSessao = inicioSessao;
    }    
    public void AdicionarFilme(ArrayList<Filme> listaFilmes, int idFilme){
        ListaSessao.add(listaFilmes.get(idFilme));
        System.out.println(ListaSessao.get(idFilme).getNomeFilme());      
    }
    public void calcularTempo(){
        int duracaoSessao = 0;
        
        for(Filme filme : ListaSessao){
            duracaoSessao += filme.getDuração();
        }
        
        LocalTime fimDaSessao = inicioSessao.plusMinutes(duracaoSessao);
        
        
        System.out.println("Numero da sala:"+sala.getNumeroSala());
        System.out.println("Inicio da Sessao: "+ inicioSessao);
        System.out.println("Duracao Total: "+ duracaoSessao+ " Minutos");
        System.out.println("Termino da Sessao: "+fimDaSessao);
    }
}
