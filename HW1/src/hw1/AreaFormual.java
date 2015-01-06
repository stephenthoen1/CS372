/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 * Area Formula Initializes the constant PI and then calculates the area.
 * @author stephenthoen
 */
public class AreaFormual {
    
    /**
     * PI constant defined
     */
    public static double PI = 3.14; 
    
    /**
     * Area calculation
     * @param a the radius of the circle being passed in.
     * @return area is returned
     * @author Stephen Thoen
     */
    public static double area(double a)
    {
        return PI*Math.pow(a, 2);
    };
}
