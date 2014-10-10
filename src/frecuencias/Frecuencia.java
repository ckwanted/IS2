package frecuencias;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Frecuencia {
   
   public static void main(String[] args) {
      
      int[] vec = {8,3,4,6,4,2,3,8,1,9,1,4,4,6,5,8,8,7,4,1,1,2,3,6,4,5};
      Map<Integer,Integer> frecuencia = new HashMap<>();
      
      for (int clave : vec) {
         frecuencia.put(clave, añadirValor(frecuencia,clave));
      }
      
      mostrar(frecuencia);
      
      saveFile(frecuencia);
            
   }
   
   public static Integer añadirValor(Map<Integer,Integer> map, Integer clave) {
      if(map.containsKey(clave)) return map.get(clave) + 1;
      else return 1;
   }
   
   public static void mostrar(Map<Integer,Integer> frecuencia) {
       for (Integer clave : frecuencia.keySet()) {
         System.out.println(clave+"->"+frecuencia.get(clave));
      }
   }
   
   public static void saveFile(Map<Integer,Integer> frecuencia) {
       
       FileWriter file;
       PrintWriter write;
       
       try {
           
           file = new FileWriter("./src/frecuencias/frec.txt");
           write = new PrintWriter(file);
           
           for (Integer clave : frecuencia.keySet()) {
               write.println(clave + "-" + frecuencia.get(clave));
           }
           
           write.close();
           file.close();
       }
       catch(Exception e) {
           System.out.println("Se ha producido un error... " + e.getMessage());
       }
       
   }
   
}
