/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.image_pgm;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thene
 */
public class PGMImage {

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the img
     */
    public ArrayList getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(ArrayList<Integer> img) {
        this.img = img;
    }
    
    private int height;
    private int width;
    private ArrayList<Integer> img;
    private String fileName;
    
    public PGMImage(String fileName){
        this.fileName=fileName;
        this.read(this.fileName);
    }
    
    public void read(String fileName){
        try {
            InputStream f = ClassLoader.getSystemClassLoader().getResourceAsStream(fileName);
            BufferedReader d = new BufferedReader(new InputStreamReader(f));
            String magic = d.readLine();    // first line contains P2 or P5
            if(!magic.equals("P2")){
                throw new PGMFormatException();
            }
            String line = d.readLine();     // second line contains height and width
            while (line.startsWith("#")) {
                line = d.readLine();
            }
            Scanner s = new Scanner(line);
            width = s.nextInt();
            height = s.nextInt();
            line = d.readLine();// third line contains maxVal
            s = new Scanner(line);
            int maxVal = s.nextInt();

            int count = 0;
            int b = 0;
            try {
                while (count < height*width) {
                    b = d.read() ;
                    img.add(b);
                    count+=1;
                }
            } catch (EOFException eof) {
                eof.printStackTrace(System.out) ;
            }
            System.out.println("Height=" + height);
            System.out.println("Width=" + height);
            System.out.println("Required elements=" + (height * width));
            System.out.println("Obtained elements=" + count);
        }
        catch(Throwable t) {
            t.printStackTrace(System.err) ;
        }
    }
    
    
            
    
}
