/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadextra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

/**
 *
 * @author Emiliano
 */
public class ActividadExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\Emiliano\\Documents\\ED13102023\\ActividadExtra\\src\\actividadextra\\texto1.txt";

        String linea, contenidoArchivo = "";
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((linea = bufferedReader.readLine()) != null) {
                contenidoArchivo += linea;
            }
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException("Error al leer el archivo");
        }
        System.out.println("Balanceo de el archivo " + nombreArchivo + ": " + comprobarParentesis(contenidoArchivo));
    }

    public static boolean comprobarParentesis(String cadena) {
        Stack<Character> stackParentesis = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);
            if (caracterActual == '(' || caracterActual == '[' || caracterActual == '{') {
                stackParentesis.push(caracterActual);
            } else if (caracterActual == ')' || caracterActual == ']' || caracterActual == '}') {
                if (stackParentesis.isEmpty()) {
                    return false;
                } else {
                    char caracterEnPila = stackParentesis.pop();
                    if (caracterActual == ')' && caracterEnPila != '(') {
                        return false;
                    } else if (caracterActual == ']' && caracterEnPila != '[') {
                        return false;
                    } else if (caracterActual == '}' && caracterEnPila != '{') {
                        return false;
                    }
                }
            }
        }

        return stackParentesis.isEmpty();
    }

    public static String leerArchivo(String nombreArchivo) {
        String linea, contenidoArchivo = "";
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((linea = bufferedReader.readLine()) != null) {
                contenidoArchivo += linea;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return contenidoArchivo;
    }
    
}
