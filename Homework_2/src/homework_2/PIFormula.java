/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

/**
 * contains the calculation for the number of time the pie formula with be run.
 * @author stephenthoen
 */
public class PIFormula {
    
    
    public static double piCalc(double value)
    {
        double pi = 4.0;
//        int test = 200000;
        int flipPosNeg = -1;
        
        for(int i = 3; i < value; i+=2 )
        {
            if(flipPosNeg == 1)
                pi += (4.0/i);
            
            else
                pi -= (4.0/i);
            
            flipPosNeg *= -1;          
        }
        System.out.println(pi);
        return pi;
        
    }
            
    
    
}
