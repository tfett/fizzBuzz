package edu.pdx.cs410J.tfetters;


/**                                                                                 
 * This class is represents a <code>fizzBuzz</code>.
 */                                                                                 
public class fizzBuzz {
                                                                                    

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
        for (int i = 1; i <101; i++){

            sb.append(i);
            sb.append("\n");
        }
        return sb.toString();
    }

    protected static String fizzBuzzConverter(Integer num){
        StringBuilder sb = new StringBuilder();
        if (num%3 == 0){
            sb.append("fizz");
        }
        if (num%5 == 0){
            sb.append("buzz");
        }

        if (!(num%3 == 0) && !(num%5 == 0)) {
            sb.append(num.toString());
        }
        return sb.toString();
    }

}