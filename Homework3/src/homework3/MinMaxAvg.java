/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;
import java.util.*;


/**
 *Has three functions that calculate the min max and avg
 * @author stephenthoen
 */
public class MinMaxAvg{
   
    
    
    /**
     * Max uses the collections tool to sort and determine the max
     * @param list
     * @return max number in list
     */
    public static int Max(ArrayList<Integer> list) {
        Collections.sort(list);
        return Collections.max(list);

    }

    /**
     * Min uses the collections tool to sort and determine the Min
     * @param list
     * @return min number in list
     */
    public static int Min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    /**
     * Avg uses the collections tool to sort and determine the Avg
     * @param list
     * @return avg
     */
    public static double Avg(ArrayList<Integer> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total = total + list.get(i);
        }

        double avg = total / list.size();

        return avg;
    }
    
    
    
}
