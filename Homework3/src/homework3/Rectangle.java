/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.ArrayList;

/**
 *
 * @author stephenthoen
 */
public class Rectangle extends Shape {

    private int _w1;
    private int _h1;

    public Rectangle(ArrayList<Integer> list) {
        if (list.get(0) == 0 || list.get(1) == 0) {
            System.out.println("Invalid rectangle sides");
            throw new IllegalArgumentException();
        }

        _w1 = list.get(0);
        _h1 = list.get(1);
    }

    public double getArea() {
        double area = _w1*_h1;
        
        return area;
    }

    public double getPerimeter() {
        double perimeter = (_w1*2)+(_h1*2);
        return perimeter;
    }

}
