/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.image_pgm;

import java.awt.Graphics;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Assert;
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
     * Test of getFileName method, of class PGMImage.
     */
    

    

    /**
     * Test of copy method, of class PGMImage.
     */
    @Test
    public void testCopy() {
        System.out.println("Testing copy");
        PGMImage instance = new PGMImage("brain.pgm");
        PGMImage result = instance.copy();
        assertArrayEquals(instance.getImg(), result.getImg());
        assertEquals(instance.getWidth(), result.getWidth());
        assertEquals(instance.getHeight(), result.getHeight());
        assertEquals(instance.getFileName(), result.getFileName());
        // TODO review the generated test code and remove the default call to fail.
        fail("The copy is invalid");
    }

    /**
     * Test of read method, of class PGMImage.
     */
    @Test
    public void testRead() {
        System.out.println("Testing read");
        String fileName = "toTest.pgm";
        PGMImage instance = new PGMImage(fileName);
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(instance.getImg(), new int[] {0, 50, 100, 150, 200, 250});
        assertEquals(instance.getWidth(), 1);
        assertEquals(instance.getHeight(), 6);
        assertEquals(instance.getFileName(), fileName);
        fail("Bad read");
    }

    /**
     * Test of write method, of class PGMImage.
     */
    @Test
    public void testWrite() throws Exception {
        System.out.println("Testing write");
        PGMImage instance = new PGMImage("toTest.pgm");
        String fileName = "test.pgm";
        instance.write(fileName);
        
        PGMImage readFile = new PGMImage(fileName);
        
        assertArrayEquals(readFile.getImg(), new int[] {0, 50, 100, 150, 200, 250});
        assertEquals(readFile.getWidth(), 1);
        assertEquals(readFile.getHeight(), 6);
        assertEquals(readFile.getFileName(), fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("Bad write");
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
        PGMImage instance = null;
        PGMImage expResult = null;
        PGMImage result = instance.applyThreshold(thr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeHistogram method, of class PGMImage.
     */
    @Test
    public void testComputeHistogram() {
        System.out.println("computeHistogram");
        PGMImage instance = null;
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.computeHistogram();
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
