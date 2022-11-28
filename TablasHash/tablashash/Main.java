/**
 * 
 */
package tablashash;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

/**
 * @author Emiliano
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int id = 1;

       
        HashTab hashTab = new HashTab(3);
        String key = "";
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Anadir: add   Remover: del   Mostrar lista: show   Clave: key   Salir: exit");
            key = input.next();
            switch (key) {
                case "add":
                    System.out.print("Ingrese nombre:");
                    String name = input.next();
                    
                    Emp emp = new Emp(id++, name);
                    hashTab.add(emp);
                    break;
                case "del":
                    System.out.println("Introducir clave");
                    hashTab.remove(input.nextInt());
                    break;
                case "show":
                    hashTab.list();
                    break;
                case "key":
                    System.out.println("Introducir clave");
                    hashTab.key(input.nextInt());
                    break;
                case "exit":
                    input.close();
                    System.exit(0);
                    break;
                default:
                    input.close();
                    System.exit(0);
                    break;
            }
        }
	}

}
