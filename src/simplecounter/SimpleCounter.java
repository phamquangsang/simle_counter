/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecounter;

/**
 *
 * @author Quang Quang
 */
public class SimpleCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        for(long i=1 ; i<=200;++i){
            System.out.print(""+i+" ");
        }
        long time1 = System.currentTimeMillis() - time;
        System.out.print("\nit take: "+ time1 + " to count");
      
    }
    
}
