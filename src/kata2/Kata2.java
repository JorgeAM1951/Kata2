/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] data = {"Marcos Mundstock", "Daniel Rabinovich", "Marcos Mundstock", "Carlos Lopez-Puchio","Carlos Lopez-Puchio"};
        
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<String,Integer> histogram = histogramGenerator.getHistogram();
        
        for(Map.Entry<String,Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        }
    }
    

