/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

import java.util.*;

/**
 * CookiePricing keeps a running total of the TM, SM, CC cookies
 * @author stephenthoen
 */
public class CookiePricing {
    
    private static double ftotal;
    
    public static int thinMintTotal(ArrayList<Integer> list)
    {
        int total= 0;
        
        for (int i = 0; i < list.size(); i++) {
            total = total + list.get(i);
        }
        
        return total;
        
    }
    
    public static int SamoasCookieTotal(ArrayList<Integer> list)
    {
        int total= 0;
        
        for (int i = 0; i < list.size(); i++) {
            total = total + list.get(i);
        }
        
        return total;
        
    }
    
    public static int ChocoChipTotal(ArrayList<Integer> list)
    {
        int total= 0;
        
        for (int i = 0; i < list.size(); i++) {
            total = total + list.get(i);
        }
        
        return total;
        
    }
    
    public static double TotalSales(ArrayList<Integer> tm, ArrayList<Integer> sm, ArrayList<Integer> cc)
    {
        double thinprice = 3.00;
        double smprice = 4.00;
        double ccprice = 5.00;
        double ttotal = 0;
        double stotal = 0;
        double ctotal = 0;
        
        
        
        for (int i = 0; i < tm.size(); i++) {
            ttotal = thinprice * tm.get(i);
        }
        
        for (int i = 0; i < sm.size(); i++) {
            stotal = smprice * sm.get(i);
        }
        
        for (int i = 0; i < cc.size(); i++) {
            ctotal = ccprice * cc.get(i);
        }
        
        ftotal = ttotal + stotal + ctotal;
        
        return ftotal;
        
        
    }
    
    
    
}
