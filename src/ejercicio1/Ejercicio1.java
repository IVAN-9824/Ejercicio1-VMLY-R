/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Ivan Rodriguez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
           String[] array ={"12.4/11-24 (4)",
"10.4/11-28 (6)",
"7.00-19 (10)",
"12.4/11-36 (12)",
"7.00-18 (6)",
"12.4/11-38 (6)",
"12.4/11-38 (14)",
"7.34-18 (10)",
"19.9/14-24 (8)",
"8.3-24 (6)",
"8.3-24 (4)",
"7.07-18 (80)",
"520/85R42",
"480/80R50",
"480/80R46"};
    Arrays.sort(array);
    List<Valores> list = new ArrayList<Valores>();
    for (int i = 0; i < array.length; i++) {
       String[] aux = array[i].split("[/ .]+");
       // System.out.println(aux[0]);
        int valor = Integer.parseInt(aux[0]);
        Valores valores=new Valores();
        valores.setValor(valor);
        valores.setCadena(array[i]);
        list.add(valores);
    }
    list.sort(Comparator.comparing(Valores::getValor));

for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getCadena());
        }


    }

   
}
