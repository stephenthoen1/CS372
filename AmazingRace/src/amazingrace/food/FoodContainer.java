/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace.food;
import java.util.*;

/**
 *
 * @author stephenthoen
 */
public class FoodContainer {
    ArrayList<FoodItem> foodarray = new ArrayList<FoodItem>();
    
    
    
    public void addItem(FoodItem f)
    {
        foodarray.add(f);
    }
     
    public int getCount()
    {
        return foodarray.size();
        
    }
    
    public int getWeight()
    {
        int weight=0;
        
        for(int i=0; i<foodarray.size();i++) {
            weight= weight + foodarray.get(i).getWeight();
        }
        
        return weight;
    }
    
    public int getVolume()
    {
        int volume=0;
        
        for(int i=0; i<foodarray.size();i++) {
            volume= volume + foodarray.get(i).getVolume();
        }
        
        return volume;
    }
    
}
