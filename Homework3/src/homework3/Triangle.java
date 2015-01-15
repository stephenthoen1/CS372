/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.*;

/**
 *
 * @author stephenthoen
 */
public class Triangle extends Shape {

    private int _t1;
    private int _t2;
    private int _t3;

    /**
     * list.get(0-2) = to the 1-3 sides of the triangle.
     * @param list 
     */
    public Triangle(ArrayList<Integer> list) {
        if (list.get(0) + list.get(1) <= list.get(2) || list.get(0) + list.get(2) <= list.get(1)
                || list.get(1) + list.get(2) <= list.get(0)) {
            System.out.println("The sides for the triangle are not valid.");
            throw new IllegalArgumentException();
        }

        _t1 = list.get(0);
        _t2 = list.get(1);
        _t3 = list.get(2);
    }

    public double getArea() {
        double sidesprimeter = (_t1 + _t2 + _t3)/2.0;
        double area = Math.sqrt(sidesprimeter*(sidesprimeter-_t1)*(sidesprimeter-_t2)
                *(sidesprimeter-_t3));
                
        return area;
    }
    
    public double getPerimeter(){
        double perimeter = (_t1 + _t2 + _t3);
        return perimeter;
    }

}
