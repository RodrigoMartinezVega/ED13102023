import java.util.LinkedHashMap;

public class LHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Crea un nuevo LinkedHashMap
		  LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>(); 
		  System.out.println("Materias semestre 3");
		  //Añade los valores a las key
		  lhm.put(23, "Emprendimiento");
          lhm.put(34, "Estructura de datos");
          lhm.put(36, "Electricidad y Magnetismo");
          System.out.println(lhm);
        
         /*Imprime las key de las materias y en la segunda iteracion borra los valores
          para poder agregar nuevas*/
         for(int i=0; i<=1;i++) {
        	 
        	 if(lhm.containsKey(23) && i==0) {//Comprueba si existe key 23
             	 System.out.println("Keys: "+ lhm.keySet()); //Imprime las key
              } else {
            	  System.out.println("Upss se acabo el semestre");
            	 lhm.clear();//Remueve todo el conjunto
            	 System.out.println("Esta vacia?: "+lhm.isEmpty()); //Verifica que este vacio
            	 System.out.println("Agregando materias...");
            	 lhm.putIfAbsent(49, "Bases de datos");//Añade una nueva entrada si no existe
            	 System.out.println(lhm);
            	 System.out.println("Tamanio: "+lhm.size());//Devuelve el tamaño del conjunto
              }
        	 
         }     
      
	}

}
