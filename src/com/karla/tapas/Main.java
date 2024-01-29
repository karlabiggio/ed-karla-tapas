package com.karla.tapas;

import com.karla.tapas.domain.Tapa;
import com.karla.tapas.presentation.MainTapa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crear tapa");
        Tapa newTapa = new Tapa("3","Huevos rotos","Bar Segovia","56",8.8,"50","43","huevos,patatas");
        MainTapa.createTapa(newTapa);
        MainTapa.printTapa("3");

        System.out.println("Obtener un listado con todas las tapas");
        MainTapa.printTapas();

        System.out.println("Eliminar una tapa");
        MainTapa.deleteTapa("1");
        MainTapa.printTapas();

        System.out.println("Obtener una tapa en concreto");
        MainTapa.printTapa("2");

        System.out.println("Actualizar una tapa");
        Tapa tapaToUpdate = new Tapa("3","Huevos rotos con tomate","Bar Segovia","43",6,"50","46","huevos, patatas, tomate");
        MainTapa.updateTapa(tapaToUpdate);
        MainTapa.printTapas();
    }
}