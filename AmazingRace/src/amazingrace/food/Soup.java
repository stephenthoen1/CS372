/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace.food;

/**
 *
 * @author stephenthoen
 */
public class Soup extends FoodItem{
    public Soup(int weight, int volume) {

        super(weight, volume);

    }

    public void Heat() {

        System.out.println("Mmm mmm good");

    }
    
     public String toString() {
        return "Soup";
    }
     public boolean equals(Object o)
     {
         return (o.getClass().equals(Soup.class));
     }
     

}
