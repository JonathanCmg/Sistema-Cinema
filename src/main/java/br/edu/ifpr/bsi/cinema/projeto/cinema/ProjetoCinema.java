/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifpr.bsi.cinema.projeto.cinema;

import br.edu.ifpr.bsi.cinema.projeto.cinema.controller.ControleCadastros;
import br.edu.ifpr.bsi.cinema.projeto.cinema.model.Filme;
import br.edu.ifpr.bsi.cinema.projeto.cinema.model.Ingresso;
import br.edu.ifpr.bsi.cinema.projeto.cinema.model.Sala;
import br.edu.ifpr.bsi.cinema.projeto.cinema.model.Sessão;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonat
 */
public class ProjetoCinema {

    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        Ingresso i = new Ingresso(30);
        Sala sala = new Sala(2,0,1);
        ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
        ArrayList<Sala> listaSalas = new ArrayList<Sala>();
        ControleCadastros cc = new ControleCadastros(listaFilmes, listaSalas);
     
        Sessão sessao = new Sessão(2,0,1,LocalTime.of(10, 30));
        Filme f = new Filme();
 
        
        
        
        cc.CadastrarFilme("Titanic", 150, "James Cameron", "Leonardo Dicaprio", "Protagonista",30);
        cc.CadastrarFilme("Rio vermelho", 180, "Howard Halks", "John Wane", "Pastor de gados!",10.5);
        sessao.AdicionarFilme(listaFilmes,0);
    
    int sair=0;
   
    while(sair != -1){
        int opcao;
        int n = 0;
        System.out.println(n);
        i.getNumeroSala();
        System.out.println("\nBem vindo ao cinema ");
        System.out.println("Digite seu nome: ");
        String nome = pp.next();
        i.setNomeCliente(nome);
        System.out.println("Digite sua idade: ");
        int idade = pp.nextInt();
        i.setIdade(idade);
        System.out.println("Tem carteira de estudante: ");
        String estudante = pp.next();
        if(estudante.equals("Sim")||estudante.equals("sim")||estudante.equals("S")||estudante.equals("s")){
            i.setEstudante(true);
        } else {
            i.setEstudante(false);
        }
        
        System.out.println("Escolha seu filme:");
        System.out.println();
        for(int e =0;e<listaFilmes.size();e++){
            System.out.println(e +" - "+listaFilmes.get(e).getNomeFilme());
            System.out.println("Valor de Ingresso: "+i.getValorIngresso());
        }
        opcao= pp.nextInt();
        switch (opcao) {
        case 0:
            i.ComprarIngresso();
            sessao.calcularTempo();
            n+=1;
            System.out.println("Digite -1 se quiser sair: ");
            sair = pp.nextInt();;
        break;
        case 1:
            i.ComprarIngresso();
            sessao.calcularTempo();
            n+=1;
            System.out.println("Digite -1 se quiser sair");
            System.out.println("Digite -1 se quiser sair: ");
            sair = pp.nextInt();
            break;
    default:
        throw new AssertionError();
}
        
    
    
    };
    }
}
