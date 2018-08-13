/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.de.simulacion;

import java.util.Random;

/**
 *
 * @author Marcel
 */
public class workThread extends Thread  {
    
    public void run(double repetitions, double chance, double success, contadorClass count, double percentage){
        Random rand = new Random();
        double repeats = 0.0;
        
         do{
        if(chance <=rand.nextFloat()){

          } 
        else {
            //System.out.println("True");
            success++;
            count.incrementContador();
             }
        
        repeats++;

        //System.out.println(percentage+"%");
     }while(repeats<repetitions);
    }
    
    
 
}
