package edu.pdx.cs410J.tfetters;

/**
 * Created by tylerfet on 7/16/14.
 */
public class romanNumerals {

    public romanNumerals () {

    }

    public static void main(String[] args) {

        System.exit(0);
    }

    public static String convert(int num) {
        int numLeft = num;
        StringBuilder sb = new StringBuilder();
        switch (numLeft) {
            case 4:
                return "IV";
            case 9:
                return "IX";
            case 40:
                return "XL";
            case 90:
                return "XC";
            case 400:
                return "CD";
            case 900:
                return "CM";
            default:

        }

        while (numLeft >=1000) {
            numLeft -= 1000;
            sb.append("M");
        }
        while (numLeft >=500 && numLeft <1000) {
            numLeft -= 500;
            sb.append("D");
        }
        while (numLeft >=100 && numLeft <500) {
            numLeft -= 100;
            sb.append("C");
        }
        while (numLeft >=50 && numLeft <100) {
            numLeft -= 50;
            sb.append("L");
        }
        while (numLeft >=10 && numLeft <50) {
            numLeft -= 10;
            sb.append("X");
        }
        while (numLeft >=5 && numLeft <10) {
            numLeft -= 5;
            sb.append("V");
        }
        while (numLeft >=1 && numLeft <5) {
        //for (int i = 0; i < numLeft; ) {
            numLeft--;
            sb.append("I");
        }


        return String.valueOf(sb);
    }


    public static String tokenizestring(String num,int significantdigit) {
        String [] result=num.split("");
        return result[significantdigit];
    }

    public static String ConvertWrapper(String num) {
        String [] tokenstring=num.split("");

        StringBuilder sb= new StringBuilder();
        Integer stringlength=tokenstring.length;
        for(int i=0; i<stringlength; i++) {
            String thisint=tokenstring[i];
            int value = Integer.parseInt(tokenstring[i])* ( (int) Math.pow(10,(stringlength-i-1)));
            sb.append(convert(value));
        }
        return sb.toString();
    }

}
