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
    
    /**
     * Computes the histogram of grey levels of the file
     * @return 
     */
    public ArrayList<Integer> computeHistogram(){
        
        ArrayList<Integer> histo = new ArrayList<Integer>();
        
        for(int i=0; i<255;i++){
            histo.add(0);
        }
        
        for(int i=0;i<height*width;i++){
            histo.set(img.get(i), histo.get(img.get(i))+1);
        }
        
        return(histo);
    }
    
    
    
    public PGMImage computeDiff(PGMImage other){
        
        PGMImage result = new PGMImage();
        
        result.height=this.height;
        result.width=this.width;
        result.fileName = "DIFF.pgm";
        result.img = new ArrayList<Integer>();
        
        try{
            if(this.height!=other.height || this.width!=other.width){
                throw new Exception();
            }
            
            
            for(int i=0;i<height*width;i++){
                int diff = this.img.get(i)-other.img.get(i);
                if(diff<0){
                    diff=0;
                }
                result.img.add(diff);
            }
        }
        catch(Exception e){
            System.err.println("The two images are not the same size, can't compute the difference");
        }
        
        return(result);
    }
            
    
}
