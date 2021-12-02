/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.image_pgm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
        read(this.fileName);
    }
    
    public void read(String fileName){
        
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
    public void overwrte() throws IOException 
    {
        write(this.fileName);
    }
    
            
    
}
