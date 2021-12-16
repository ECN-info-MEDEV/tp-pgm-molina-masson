/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.image_pgm;

import java.awt.Graphics;
import java.util.ArrayList;
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
     * Test of getFileName method, of class PGMImage.
     */
    

    

    /**
     * Test of copy method, of class PGMImage.
     */
    @Test
    public void testCopy() {
        System.out.println("copy");
        PGMImage instance = null;
        PGMImage expResult = null;
        PGMImage result = instance.copy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PGMImage.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String fileName = "";
        PGMImage instance = null;
        instance.read(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class PGMImage.
     */
    @Test
    public void testWrite() throws Exception {
        System.out.println("write");
        String fileName = "";
        PGMImage instance = null;
        instance.write(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
