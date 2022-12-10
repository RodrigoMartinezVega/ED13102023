import java.util.HashMap;  // Importa la clase HashMap
public class HashMapExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Copa America and Eurocopa 2022");
		//Inicializamos el Hash utilizando genericos para asignar un valor a cada key
		
		HashMap <Integer, String> Americanos = new HashMap<Integer, String>();
		//Le damos un valor a cada key del HashMap
		Americanos.put(1,"Argentina");
		Americanos.put(2, "Brasil");
		Americanos.put(3, "Uruguay");
		
		HashMap <Integer, String> Europeos = new HashMap<Integer, String>();
		Europeos.put(1, "Francia");
		Europeos.put(2, "Espania");
		Europeos.put(3, "Croacia");
		
		System.out.println("Grupo A: "+ Americanos +" Grupo E: "+Europeos);
         //Devuelve el número de elementos Clave/Valor de los mapas por grupo
		System.out.println("Numero de equipos por grupo : "+Americanos.size());
		
		//Evalua si existe algun equipo con la key numero 3 
		//Evalua si existe algun equipo con el valor España
		
		if(Americanos.containsKey(3) && Europeos.containsValue("Espania")){
			System.out.println(Americanos.get(3)+ " y "+//Obtine el valor de la key seleccionada
		    Europeos.get(2)+" quedan eliminados");
			Europeos.remove(2);//Elimina el valor de una key en especifico (2)
			Americanos.remove(3);
		}else {
			System.out.println(" No existe tal key o tal valor xD");
		}
		
		Americanos.putAll(Europeos);//Copia todo lo de un mapa en el otro
		System.out.println("Resultados: "+Americanos);
	    
	}

}
