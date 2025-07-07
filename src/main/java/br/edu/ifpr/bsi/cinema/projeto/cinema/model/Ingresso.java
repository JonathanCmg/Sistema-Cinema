/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.cinema.projeto.cinema.model;

/**
 *
 * @author igorc
 */
public class Ingresso extends Sala{
    
    Filme f = new Filme();
    //atributos
    private String nomeCliente;
    private int idade;
    private boolean estudante;
    private double valorIngresso;

    public Ingresso(String nomeCliente, int idade, boolean estudante, double valorIngresso) {
        this.nomeCliente = nomeCliente;
        this.idade = idade;
        this.estudante = estudante;
        this.valorIngresso = valorIngresso;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public void ComprarIngresso(){
        if(idade>18||estudante == true){
            valorIngresso = valorIngresso / 2;
        }
        if(getLugaresOcupados() >= getLugares()){
            System.out.println("Lotação maxima atingida");
        }
        System.out.println("--------------------------------------");
        System.out.println("Nome:"+nomeCliente);
        System.out.println("idade:"+idade);
        System.out.println("Filme"+f.getNomeFilme());
        System.out.println("Duração"+f.getDuração());
        System.out.println("Valor Ingresso:"+valorIngresso);
        System.out.println("Numero Sala:"+getNumeroSala());
        System.out.println("---------------------------------------");
    }
}
