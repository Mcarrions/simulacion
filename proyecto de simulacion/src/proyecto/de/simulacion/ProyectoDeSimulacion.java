/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.de.simulacion;
import java.util.Random;
import java.text.DecimalFormat;
/**
 *
 * @author Marcel
 */
public class ProyectoDeSimulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       workThread thread = new workThread(); 
       double repetitions=400;
       double percentage, chance = 1.0;
       contadorClass count = new contadorClass();
       int processors = Runtime.getRuntime().availableProcessors();
       double assignPerThread = repetitions/processors;

       
       System.out.println(assignPerThread+" repeticiones por nucleo");
       
       if(processors>repetitions){
           for (int i = 0; i < repetitions; i++) {
               thread.run(1, chance, count);
               
           }
       }
       else{
              for (int i = 0; i < processors; i++) {
               thread.run(assignPerThread, chance, count);
            }   
       }
       
        System.out.println("Total de exitos:"+count.returnContador());
    }
}
