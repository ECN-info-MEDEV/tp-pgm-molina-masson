/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.image_pgm;

import java.util.Arrays;

/**
 *
 * @author Valentin Molina valentin@molina.pro
 */
public class Main {
    
    public static void main(String[] argv)
    {
        PGMImage img = new PGMImage("C:\\CENTRALE\\MEDEV\\TP 3\\Images Test PGM\\brain.pgm");
        try{
            img.write("C:\\CENTRALE\\MEDEV\\TP 3\\Images Test PGM\\test.pgm");
        }
        catch(Exception e){
            System.out.println("Could not write the file");
        }
             
        imageFrame fr = new imageFrame(img);
        
        System.out.println(Arrays.toString(img.getImg()));
    }
    
    
}
