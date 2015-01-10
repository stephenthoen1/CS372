/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;
import java.util.*;

/**
 *This class tells the gerbils to hop or create the list or map
 * @author stephenthoen
 */
public class Gerbil {
    
    private int gerbilNumber;
    
    public Gerbil(int i)
    {
        gerbilNumber = i;
    }
   
    public String toString()
    {
        return "Gerbil #"+ gerbilNumber;
    }
    
    public void hop()
    {
        System.out.println(toString() + " is hopping!");
    }
    
    public static void gerbilList()
    {
        List gerbilList = new ArrayList();
        System.out.println("\n This is PR2_1");
        for(int i = 1; i <= 10; i++)
            gerbilList.add(new Gerbil(i));
 
        for(int i = 0; i < gerbilList.size(); i ++)
            ((Gerbil)gerbilList.get(i)).hop();
        
        
        System.out.println("\n This is PR2_2");
        Iterator e = gerbilList.iterator();
        while(e.hasNext())
            ((Gerbil)e.next()).hop();
        System.out.println();
        
    }
    
    
    public static void makeMap()
    {
        HashMap<String, Gerbil> g = new HashMap<String, Gerbil>();
            g.put("Kat", new Gerbil(0));
            g.put("Oliver", new Gerbil(1));
            g.put("Cole", new Gerbil(2));
            g.put("Dodge", new Gerbil(3));
            g.put("Lyle", new Gerbil(4));
            g.put("Brett", new Gerbil(5));
            g.put("Tyler", new Gerbil(6));
            g.put("Jordyn", new Gerbil(7));
            g.put("Jenna", new Gerbil(8));
        Iterator<String> iter = g.keySet().iterator();
        
        while(iter.hasNext())
        {
            String n = iter.next();
            System.out.print(n);
            g.get(n).hop();
        }
        
            
    }
    
    
    
    
}
