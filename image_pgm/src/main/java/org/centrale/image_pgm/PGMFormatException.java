/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package org.centrale.image_pgm;

/**
 *
 * @author thene
 */
public class PGMFormatException extends Exception{

    /**
     * Creates a new instance of <code>PGMFormatException</code> without detail
     * message.
     */
    public PGMFormatException() {
    }

    /**
     * Constructs an instance of <code>PGMFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PGMFormatException(String msg) {
        super(msg);
    }
}
