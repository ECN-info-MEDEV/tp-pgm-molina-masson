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
    
    
    /**
     * PGMImage constructor that loads an image from a fileName.
     * @param fileName The complete path to the image to load.
     */
    public PGMImage(String fileName){
        this.fileName=fileName;
        this.read(this.fileName);
    }
    
    
    /**
     * PGMImage copy constructor.
     * @param other The PGMImage to be copied.
     */
    public PGMImage(PGMImage other)
    {
        this.height = other.getHeight();
        this.width = other.getWidth();
        this.fileName = other.getFileName();
        this.img = new ArrayList<Integer>();
        for(int i = 0 ; i < this.height*this.width ; i ++)
        {
            this.img.add((Integer)other.getImg().get(i));
        }
    }
    
    
    /** 
     * A method that copy the current PGMImage.
     * @return 
     */
    public PGMImage copy()
    {
        return new PGMImage(this);
    }
    
    
    public void read(String fileName){
        this.img = new ArrayList<Integer>();
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
    
    
    /**
     * Write the image en PGM format.
     * @param fileName The name (with total path) to the file where the image 
     * will be saved.
     * @throws IOException If the file can't be write.
     */
    public void write(String fileName) throws IOException 
    {
        String path = fileName;
        if( ! (fileName.substring(fileName.length()-4).equals(".pgm")) ) {
            path = fileName + ".pgm";
        }
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        
        writer.write("P2");
        writer.newLine();
        
        writer.write("# no comment.");
        writer.write("");
        
        writer.write(this.height);
        writer.write(" ");
        writer.write(this.width);
        writer.newLine();
        
        writer.write(255);
        writer.newLine();
        
        int nbPixel = this.height * this.width;
        int nbChar = 0;
        for(int i = 0 ; i < nbPixel ; i ++)
        {
            int px = this.img.get(i);
            writer.write(px);
            if(px < 10){
                writer.write("   ");
            }
            else if(px < 100) {
                writer.write("  ");
            }
            else {
                writer.write(" ");
            }
            nbChar += 4;
            if(nbChar == 70){
                writer.newLine();
                nbChar = 0;
            }
        }
    }
    
    
    /**
     * Overwrite the current image file in PGM format.
     * @throws IOException If the file can't be write.
     */
    public void overwrite() throws IOException 
    {
        write(this.fileName);
    }
    
    
    /**
     * Apply a threshold to a gray scale PGM Image.
     * @param thr The threshold (0 - 255) 
     * @return A PGMImage resulting with the apply of the threshold.
     */
    public PGMImage applyThreshold(int thr)
    {
        PGMImage output = this.copy();
        
        for(int i = 0 ; i < this.height*this.width ; i++)
        {
            if(this.img.get(i) > thr)
            {
                output.getImg().set(i, thr);
            }
        }
        
        return output;
    }
    
}
