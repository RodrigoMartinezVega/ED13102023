/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import Tb.Nom;
import java.io.IOException;


/**
 *
 * @author Emiliano
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Nom nom = new Nom("C:\\Users\\Emiliano\\Documents\\ED13102023\\TrabajadorJava\\src\\main\\java\\junio.dat", "Jarritos");
        nom.calcularSueldo();
        nom.obtener_max_min();
    }
}
