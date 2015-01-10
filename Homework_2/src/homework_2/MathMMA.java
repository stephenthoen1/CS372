/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

import java.util.*;

/**
 * Calculates the Min Max and Avg of gradbook scores.
 * @author stephenthoen
 */
public class MathMMA {

    public static double Max(ArrayList<Double> list) {
        Collections.sort(list);
        return Collections.max(list);

    }

    public static double Min(ArrayList<Double> list) {
        return Collections.min(list);
    }

    public static double Avg(ArrayList<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total = total + list.get(i);
        }

        double avg = total / list.size();

        return avg;
    }

}
