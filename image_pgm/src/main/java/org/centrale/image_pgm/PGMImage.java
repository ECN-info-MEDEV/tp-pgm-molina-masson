/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.image_pgm;

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
    
    
            
    
}
