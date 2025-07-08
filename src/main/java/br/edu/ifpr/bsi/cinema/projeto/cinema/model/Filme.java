/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.cinema.projeto.cinema.model;

/**
 *
 * @author igorc
 */
public class Filme {
    
    //Criação da classe Filme:
    //atributos:
    private String nomeFilme;
    private float duração;
    private String diretor;
    private String atorPrincipal;
    private String papel;
    
    //Contrutor Vazio
    public Filme() {
    }
    
    //Construtor Principal
    public Filme(String nomeFilme, float duração,String diretor, String atorPrincipal, String papel) {
        this.nomeFilme = nomeFilme;
        this.duração = duração;
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.papel = papel;
    }
    
    //Getters e Setters
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public float getDuração() {
        return duração;
    }

    public void setDuração(float duração) {
        this.duração = duração;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return "Filme{" + "nomeFilme=" + nomeFilme + ", duracao=" + duração + ", diretor=" + diretor + ", atorPrincipal=" + atorPrincipal + ", papel=" + papel + '}';
    }
    
    
    
}
