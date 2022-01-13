/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.image_pgm;

import java.awt.Graphics;
import java.util.List;
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
        System.out.println("Testing copy");
        PGMImage instance = new PGMImage("brain.pgm");
        PGMImage result = instance.copy();
        assertArrayEquals("Test copy fails : error in the copy of the array.", instance.getImg(), result.getImg());
        assertEquals("Test copy fails : error in the copy of the width.", instance.getWidth(), result.getWidth());
        assertEquals("Test copy fails : error in the copy of the height.", instance.getHeight(), result.getHeight());
        assertEquals("Test copy fails : error in the copy of the file name.", instance.getFileName(), result.getFileName());
    }

    /**
     * Test of read method, of class PGMImage.
     */
    @Test
    public void testRead() {
        System.out.println("Testing read");
        String fileName = "toTest.pgm";
        PGMImage instance = new PGMImage(fileName);

        assertEquals("Test read fails : the width is wrongly read.", instance.getWidth(), 2);
        assertEquals("Test read fails : the height is wrongly read.", instance.getHeight(), 6);
        assertEquals("Test read fails : the file name is wrongly read.", instance.getFileName(), fileName);
        assertArrayEquals("Test read fails : the array is wrongly read.", instance.getImg(), new int[] {0, 50, 100, 150, 200, 250,
                                                                                                        0, 50, 100, 150, 200, 250});
    }

    /**
     * Test of write method, of class PGMImage.
     */
    @Test
    public void testWrite() {
        System.out.println("Testing write");
        
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
            System.err.println("An error has occured will writing the file.");
            e.printStackTrace(System.err) ;
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
        System.out.println("overwrite");
        PGMImage instance = null;
        instance.overwrite();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyThreshold method, of class PGMImage.
     */
    @Test
    public void testApplyThreshold() {
        System.out.println("applyThreshold");
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
        
    }

    /**
     * Test of computeHistogram method, of class PGMImage.
     */
    @Test
    public void testComputeHistogram() {
        System.out.println("computeHistogram");
        PGMImage instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.computeHistogram();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeDiff method, of class PGMImage.
     */
    @Test
    public void testComputeDiff() {
        System.out.println("computeDiff");
        PGMImage other = null;
        PGMImage instance = null;
        PGMImage expResult = null;
        PGMImage result = instance.computeDiff(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class PGMImage.
     */
    @Test
    public void testDrawImage() {
        System.out.println("drawImage");
        Graphics gr = null;
        PGMImage instance = null;
        instance.drawImage(gr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
