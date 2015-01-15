/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

/**
 *Sets the username and starting total of the player.
 * @author stephenthoen
 */
public class GameInfo {
    
     public static String User_name;
    
    public static void username(String name)
    {
         User_name = name;
    }
    
    public static int start()
    {
        int starting_total = 500;
        
        return starting_total;
    }
    
    
   
}
