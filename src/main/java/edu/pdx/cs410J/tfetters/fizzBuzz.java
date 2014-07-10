package edu.pdx.cs410J.tfetters;

import edu.pdx.cs410J.lang.Human;

import javax.swing.*;
import java.util.ArrayList;

/**
 * This class is represents a <code>fizzBuzz</code>.
 */
public class fizzBuzz {


    public static final int MAX_VALUE = 101;
    public static final int fizzbasis = 3;
    public static final int buzzbasis = 5;


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
        sb.append(FizzLogic(num, fizzbasis));
        sb.append(BuzzLogic(num, buzzbasis));

        if (!(num % 3 == 0) && !(num % 5 == 0)) {
            sb.append(num.toString());
        }
        return sb.toString();
    }

    private static String FizzLogic(Integer num, Integer basis) {
        if (num % basis == 0) {
            return ("Fizz");
        }
        return "";
    }

    private static String BuzzLogic(Integer num, Integer basis) {
        if (num % basis == 0) {
            return ("Buzz");
        }
        return "";
    }


}