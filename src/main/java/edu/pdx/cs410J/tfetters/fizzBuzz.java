package edu.pdx.cs410J.tfetters;

import edu.pdx.cs410J.lang.Human;

import javax.swing.*;
import java.util.ArrayList;

/**
 * This class is represents a <code>fizzBuzz</code>.
 */
public class fizzBuzz {


    public static final int MAX_VALUE = 101;

    public fizzBuzz() {

    }


    /**
     * Main program that parses the command line, creates a
     * <code>fizzBuzz</code>, and prints a description of the fizzBuzz to
     * standard out by invoking its <code>toString</code> method.
     */
    public static void main(String[] args) {

        System.out.print(getNumbersFrom1to100());

        System.exit(0);
    }

    protected static String getNumbersFrom1to100() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < MAX_VALUE; i++) {
            sb.append(fizzBuzzConverter(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    protected static String fizzBuzzConverter(Integer num) {
        StringBuilder sb = new StringBuilder();
        if (num % 3 == 0) {
            sb.append("Fizz");
        }
        if (num % 5 == 0) {
            sb.append("Buzz");
        }

        if (!(num % 3 == 0) && !(num % 5 == 0)) {
            sb.append(num.toString());
        }
        return sb.toString();
    }

}