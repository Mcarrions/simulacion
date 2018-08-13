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
        
        
       double count = 0, success=0, repetitions=7000;
       double percentage, chance = 1.0/500.0;
       int processors = Runtime.getRuntime().availableProcessors();
       Random rand = new Random();
        System.out.println(repetitions/processors+" repeticiones por nucleo");
     do{
         
      if(chance <=rand.nextFloat()){
          
        } 
      else {
          //System.out.println("True");
          success++;
           }
      count++;
      percentage = ((count)/repetitions)*100;
      
      //System.out.println(percentage+"%");
     }while(count<repetitions);
        System.out.println(success+" exito(s)");
    }
    
}
