/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.ArrayList;

/**
 *Calculates the area and perimeter for and Ellipse, Ovewrites shape.
 * @author stephenthoen
 */
public class Ellipse extends Shape {
    private int _rd1;
    private int _rd2;
    
    
    public Ellipse(ArrayList<Integer> list)
    {
        if (list.get(0) == 0 || list.get(1) == 0) {
            System.out.println("Invalid rectangle sides");
            throw new IllegalArgumentException();
        }
        _rd1 = list.get(0);
        _rd2 = list.get(1);
    }
    
    public double getArea(){
        double area = (Math.PI)*_rd1*_rd2;
        
        return area;
    }
    
    public double getPerimeter()
    {
       double perimeter = (2*Math.PI)
               *(Math.sqrt(((Math.pow(_rd1, 2))+ (Math.pow(_rd2, 2)))/2.0)); 
       
       return perimeter;
    }
    
    
}
