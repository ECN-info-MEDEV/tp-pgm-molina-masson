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
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        PGMImage instance = null;
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileName method, of class PGMImage.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        String fileName = "";
        PGMImage instance = null;
        instance.setFileName(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class PGMImage.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        PGMImage instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class PGMImage.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        PGMImage instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class PGMImage.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        PGMImage instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class PGMImage.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 0;
        PGMImage instance = null;
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImg method, of class PGMImage.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        PGMImage instance = null;
        int[] expResult = null;
        int[] result = instance.getImg();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImg method, of class PGMImage.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        int[] img = null;
        PGMImage instance = null;
        instance.setImg(img);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

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
