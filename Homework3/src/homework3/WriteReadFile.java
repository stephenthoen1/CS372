/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.*;
import java.io.*;

/**
 * Load and Save File for The Event Calendar.
 * @author stephenthoen
 */
public class WriteReadFile {

    public static Vector<Vector<String>> load() {
        Vector<Vector<String>> loadEvents = new Vector<Vector<String>>();
        File nf = new File("/Users/stephenthoen/GitHub/CS372/Homework3/Data.txt");
        String Line;
        String[] newline;

        try {

            BufferedReader br = new BufferedReader(new FileReader(nf));

            while ((Line = br.readLine()) != null) {
                newline = Line.split(", ");

                Vector<String> tmp = new Vector<String>();

                for (int i = 0; i < newline.length; i++) {
                    tmp.add(newline[i]);
                }

                loadEvents.add(tmp);
            
            }
            br.close();
        } catch (Exception e) {
            System.out.print("Did not read in file");
        }
        return loadEvents;
    }

    public static void save(ArrayList<String> list) {
        File file = new File("Data.txt");

        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true));

            for (int i = 0; i < list.size(); i++) {
                buffer.write(list.get(i));
                buffer.newLine();

            }
            buffer.close();
        } catch (Exception e) {
            System.out.print("There was a problem with the output file");
        }
    }

}
