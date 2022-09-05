/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
/**
 *
 * @author Emiliano
 */

public class Nom{
    private String nombreCompania;
    private ElArreglo<Trabajador> arregloEmpleados;
    private String rutaArchivo;
    public static String SEPARATOR_LINE = "\n";
    public static String SEPARATOR_COMMA = ",";

    public Nom(String rutaArchivo, String nombreCompania) throws IOException {
        this.nombreCompania = nombreCompania;
        this.rutaArchivo = rutaArchivo;
        int contador = 0;
        String line, fileContent = "";
        BufferedReader bufferLectura = new BufferedReader(new FileReader(this.rutaArchivo));
        bufferLectura.readLine();
        while((line = bufferLectura.readLine()) != null) {
            fileContent += line + "\n";
            contador++;
        }
        bufferLectura.close();

        String[] saltoLinea = fileContent.split(SEPARATOR_LINE);
        arregloEmpleados = new ElArreglo<>(contador);
        for(int i = 0; i < saltoLinea.length; i++) {
            String[] comas = saltoLinea[i].split(SEPARATOR_COMMA);
            Trabajador trab = new Trabajador();
            trab.setNumeroTrabajador(parseInt(comas[0]));
            trab.setNombre(comas[1]);
            trab.setPaterno(comas[2]);
            trab.setMaterno(comas[3]);
            trab.setHorasExtra(parseInt(comas[4]));
            trab.setSueldoBase(parseInt(comas[5]));
            trab.setAnioIngreso(parseInt(comas[6]));
            arregloEmpleados.setItem(i, trab);
        }
    }

    public Nom(String juniodat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Nom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void calcularSueldo() {
        for(int i = 0; i < arregloEmpleados.getLength(); i++){
            System.out.println(arregloEmpleados.getItem(i));
            System.out.println("El sueldo total es de " + arregloEmpleados.getItem(i).calcularSueldo()+" mxn");
        }
    }

    public void obtener_max_min() {
        Trabajador trabMax= arregloEmpleados.getItem(0);
        Trabajador trabMin = arregloEmpleados.getItem(0);
        for(Trabajador actualTrabajador : arregloEmpleados) {
            if(actualTrabajador.getAnioIngreso() > trabMax.getAnioIngreso()) {
                trabMax= actualTrabajador;
            }
            if(actualTrabajador.getAnioIngreso() < trabMin.getAnioIngreso()) {
                trabMin= actualTrabajador;
            }
        }

        System.out.println("                     " + nombreCompania + "   ");
        System.out.println("Trabajador con menor antiguedad en la empresa: "+trabMin); 
        System.out.println("Trabajador con mayor antiguedad en la empresa: "+trabMax);
    }
}
