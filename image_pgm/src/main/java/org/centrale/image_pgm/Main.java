/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.image_pgm;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Valentin Molina valentin@molina.pro
 */
public class Main {
    
    public static void main(String[] argv)
    {
        PGMImage img = new PGMImage("brain.pgm");
        System.out.println("brain.pgm : " +img.getHeight()+"x"+img.getWidth());
        try{
            img.write("test.pgm");
        }
        catch(Exception e){
            System.out.println("Could not write the file");
        }
             
        //ImageFrame fr = new ImageFrame(img);
        
        //System.out.println(Arrays.toString(img.getImg()));
        
        System.out.println("----------------------------");
        // reading the testing sample :
        PGMImage instance = new PGMImage("toTest.pgm");
        System.out.println("Size of the sample : "+instance.getHeight()+"x"+instance.getWidth());
        System.out.println("Number of pixels : "+instance.getImg().length);
        System.out.println(Arrays.toString(instance.getImg()));
        
        // test of write :
        String fileName = "test2.pgm";
        try {
            instance.write(fileName);
        }
        catch (IOException e) {
            System.err.println("An error has occured will writing the file.");
            e.printStackTrace(System.err) ;
        }
    }
}
