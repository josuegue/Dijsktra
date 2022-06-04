/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graforuta;

import DepartmentPackage.CargarDptos;
import GrafosPkg.Grafo;

/**
 *
 * @author Ruldin Ayala
 */
public class inicio {
    
    public static void main(String[] args) {
        CargarDptos data = new CargarDptos();
        String [] dataDpto = data.getArray();
        Grafo g = new Grafo(dataDpto);
        g.agregarRuta("Jutiapa","Atescatempa", 3);
        g.agregarRuta("Jutiapa","Santa Catarina Mita", 6);
        g.agregarRuta("Jutiapa","El Progreso",10);
        g.agregarRuta("Atescatempa","Quesada", 5);
        g.agregarRuta("Atescatempa","Santa Catarina Mita", 2);
        g.agregarRuta("Quesada","Zapotitlan", 8);
        g.agregarRuta("Quesada","Santa Catarina Mita", 9);
        g.agregarRuta("Quesada","El Progreso", 7);
        g.agregarRuta("Zapotitlan","El Progreso", 4);
        g.agregarRuta("Santa Catarina Mita","El Progreso", 4);
        String inicio = "Jutiapa";
        String fin    = "Zapotitlan";
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
    }
}
