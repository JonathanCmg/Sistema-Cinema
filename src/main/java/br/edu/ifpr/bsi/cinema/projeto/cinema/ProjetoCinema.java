/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifpr.bsi.cinema.projeto.cinema;

import br.edu.ifpr.bsi.cinema.projeto.cinema.controller.ControleCadastros;

/**
 *
 * @author Jonat
 */
public class ProjetoCinema {

    public static void main(String[] args) {
        ControleCadastros cc = new ControleCadastros();
        cc.CadastrarFilme("titanic", 1000, "Sla", "Leo", "Prota");
        cc.CadastrarFilme("Agulha", 2, "S1la", "Le33o", "Pro44ta");
        cc.CadastrarSala(10, 10, 10);
    }
}
