/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.Histogram;

/**
 *
 * @author carlo
 */
public class MailHistogramBuilder {
    
    
    public Histogram<String> getHisto(List<String> list) {
        Histogram histo = new Histogram();
        for(String i : list){
            histo.increment(i);
        }
        return histo;
    }
    
    
    
}
