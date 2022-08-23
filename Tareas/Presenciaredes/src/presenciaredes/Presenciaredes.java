/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presenciaredes;


import manipularcsv.ManipularCSV;
/**
 *
 * @author Emiliano
 */
public class Presenciaredes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManipularCSV archivo=new ManipularCSV();
        archivo.leerArchivo("C:\\Users\\Emiliano\\Downloads\\presenciaredes.csv");
    }
    
}
