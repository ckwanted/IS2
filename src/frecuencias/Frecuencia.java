package frecuencias;

import java.util.HashMap;
import java.util.Map;

public class Frecuencia {
   
   public static Integer añadirValor(Map<Integer,Integer> map, Integer clave) {
      if(map.containsKey(clave)) return map.get(clave) + 1;
      else return 1;
   }
   
   public static void main(String[] args) {
      
      int[] vec = {5,1,2,3,5,2,3,5,4,3,4,5,4,4,5};
      Map<Integer,Integer> frecuencia = new HashMap<>();
      
      for (int clave : vec) {
         frecuencia.put(clave, añadirValor(frecuencia,clave));
      }
      
      for (Integer clave : frecuencia.keySet()) {
         System.out.println(clave+"->"+frecuencia.get(clave));
      }
      
   }
   
}
