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
        int [] data = {1,4,1,4,5,6,8,8,4,5,6,2};
        
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<Integer,Integer> histogram = histogramGenerator.getHistogram();
        
        for(Map.Entry<Integer,Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        }
    }
    
}
