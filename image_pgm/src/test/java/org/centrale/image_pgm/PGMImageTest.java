/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.image_pgm;

import java.io.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thene
 */
public class PGMImageTest {
    
    public PGMImageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of copy method, of class PGMImage.
     */
    @Test
    public void testCopy() {
        System.out.println("---------- Testing copy ----------");
        PGMImage instance = new PGMImage("brain.pgm");
        PGMImage result = instance.copy();
        assertArrayEquals("Test copy fails : error in the copy of the array.", result.getImg(), instance.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", result.getWidth(), instance.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", result.getHeight(), instance.getHeight());
        assertEquals("Test copy fails : error in the copy of the file name.", result.getFileName(), instance.getFileName());
    }

    /**
     * Test of read method, of class PGMImage.
     */
    @Test
    public void testRead() {
        System.out.println("---------- Testing read ----------");
        String fileName = "toTest.pgm";
        PGMImage instance = new PGMImage(fileName);

        assertEquals("Test read fails : the width is wrongly read.", 2, instance.getWidth());
        assertEquals("Test read fails : the height is wrongly read.", 6, instance.getHeight());
        assertEquals("Test read fails : the file name is wrongly read.", fileName, instance.getFileName());
        assertArrayEquals("Test read fails : the array is wrongly read.", 
                new int[] {0, 50, 100, 150, 200, 250, 0, 50, 100, 150, 200, 250}, instance.getImg());
    }

    /**
     * Test of write method, of class PGMImage.
     */
    @Test
    public void testWrite() {
        System.out.println("---------- Testing write ----------");
        
        // reading the testing sample :
        PGMImage instance = new PGMImage("brain.pgm");
        System.out.println("Size of the sample : "+instance.getHeight()+"x"+instance.getWidth());
        System.out.println("Number of pixels : "+instance.getImg().length);
        
        // test of write :
        String fileName = "test.pgm";
        try {
            instance.write(fileName);
        }
        catch (IOException e) {
            System.out.println("An error has occured will writing the file.");
            e.printStackTrace(System.out) ;
        }
        
        // read the result :
        PGMImage readFile = new PGMImage(fileName);
        
        assertArrayEquals(instance.getImg(), readFile.getImg());
        assertEquals(instance.getWidth(), readFile.getWidth());
        assertEquals(instance.getHeight(), readFile.getHeight());
        assertEquals(fileName, readFile.getFileName());
    }

    /**
     * Test of overwrite method, of class PGMImage.
     */
    @Test
    public void testOverwrite() throws Exception {
        System.out.println("---------- overwrite ----------");
        PGMImage instance = new PGMImage("brain_2.pgm");
        instance.overwrite();
        PGMImage overwrited = new PGMImage("brain_2.pgm");
        
        assertArrayEquals(instance.getImg(), overwrited.getImg());
        assertEquals(instance.getWidth(), overwrited.getWidth());
        assertEquals(instance.getHeight(), overwrited.getHeight());
        assertEquals("brain_2.pgm", overwrited.getFileName());
    }

    /**
     * Test of applyThreshold method, of class PGMImage.
     */
    @Test
    public void testApplyThreshold() {
        System.out.println("---------- applyThreshold ----------");
        int thr = 0;
        PGMImage instance = new PGMImage("test", 10, 10, 255);
        PGMImage expResult = new PGMImage("result", 10, 10, 0);
        PGMImage result = instance.applyThreshold(thr);
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
                
        thr = 50;
        instance = new PGMImage("test", 10, 10, 255);
        expResult = new PGMImage("result", 10, 10, 50);
        result = instance.applyThreshold(thr);
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
                
        thr = 100;
        instance = new PGMImage("test", 10, 10, 255);
        expResult = new PGMImage("result", 10, 10, 100);
        result = instance.applyThreshold(thr);
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
                
        thr = 150;
        instance = new PGMImage("test", 10, 10, 255);
        expResult = new PGMImage("result", 10, 10, 150);
        result = instance.applyThreshold(thr);
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
        
        thr = 200;
        instance = new PGMImage("test", 10, 10, 255);
        expResult = new PGMImage("result", 10, 10, 200);
        result = instance.applyThreshold(thr);
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
        
        thr = 255;
        instance = new PGMImage("test", 10, 10, 255);
        expResult = new PGMImage("result", 10, 10, 255);
        result = instance.applyThreshold(thr);
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());


        thr = 100;
        instance = new PGMImage("test", 10, 10, 50);
        expResult = new PGMImage("result", 10, 10, 50);
        result = instance.applyThreshold(thr);
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
        
    }

    /**
     * Test of computeHistogram method, of class PGMImage.
     */
    @Test
    public void testComputeHistogram() {
        System.out.println("---------- computeHistogram ----------");
        String fileName = "toTest.pgm";
        PGMImage instance = new PGMImage(fileName);
        int[]histo = instance.computeHistogram();
        assertEquals(2, histo[0]);
        assertEquals(2, histo[50]);
        assertEquals(2, histo[100]);
        assertEquals(2, histo[150]);
        assertEquals(2, histo[200]);
        assertEquals(2, histo[250]);
        
     }

    /**
     * Test of computeDiff method, of class PGMImage.
     */
    @Test
    public void testComputeDiff() {
        System.out.println("---------- computeDiff ----------");
        PGMImage instance1 = new PGMImage("test", 10, 10, 255);
        PGMImage instance2 = new PGMImage("test", 10, 10, 255);
        PGMImage expResult = new PGMImage("result", 10, 10, 0);
        PGMImage result = instance1.computeDiff(instance2);
        
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
        
        
        instance1 = new PGMImage("test", 10, 10, 200);
        instance2 = new PGMImage("test", 10, 10, 50);
        expResult = new PGMImage("result", 10, 10, 150);
        result = instance1.computeDiff(instance2);
        
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
        
        instance1 = new PGMImage("test", 10, 10, 50);
        instance2 = new PGMImage("test", 10, 10, 100);
        expResult = new PGMImage("result", 10, 10, 0);
        result = instance1.computeDiff(instance2);
        
        assertArrayEquals("Test copy fails : error in the copy of the array.", expResult.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", expResult.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", expResult.getHeight(), result.getHeight());
        
        
        
    }

    
}
