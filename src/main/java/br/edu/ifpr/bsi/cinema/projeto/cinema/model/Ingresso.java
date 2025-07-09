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

    public Ingresso(double valorIngresso) {
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
        int lugares = super.getLugaresOcupados();
        int lugaresOcupados = super.getLugaresOcupados();
        
        if(idade>18||estudante == true){
            if(valorIngresso== 30){
            valorIngresso = valorIngresso / 2;
            }
        }

            System.out.println("--------------------------------------");
            System.out.println("Nome:"+nomeCliente);
            System.out.println("idade:"+idade);
            System.out.println("Valor Ingresso:"+valorIngresso);
    }
}
