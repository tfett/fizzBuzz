package edu.pdx.cs410J.tfetters;
enum pixeltype {black, blank, mirror, dot, pplt};
enum direction {left, right, up, down};

/**
 * This class is represents a <code>fizzBuzz</code>.
 */
public class PacManPixel {

    public PacManPixel() {

    }

    public void setpixeltype(pixeltype pt) {
        type=pt;
    }

    public pixeltype gettype() {
        return type;
    }
    public pixeltype type;

}