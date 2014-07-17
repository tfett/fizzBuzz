package edu.pdx.cs410J.tfetters;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertTrue;
import edu.pdx.cs410J.InvokeMainTestCase;
import static junit.framework.Assert.assertEquals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;


import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * JUnit tests for the fizzBuzz class.  These tests extend <code>InvokeMainTestCase</code>
 * which allows them to easily invoke the <code>main</code> method of <code>fizzBuzz</code>.
 * They also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>matchers
 * for more readable assertion statements.
 */
public class fizzBuzzTest extends InvokeMainTestCase
{

  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf0() {
    MainMethodResult result = invokeMain(fizzBuzz.class);
    assertThat(result.getExitCode(), equalTo(0));
  }

  @Test
  public void printNumbersFromOneTo100() {
      MainMethodResult result = invokeMain(fizzBuzz.class);
      assertThat(result.getOut(), containsString(fizzBuzz.getNumbersFrom1to100()));

  }

    @Test
    public void printFourReturnsFour() {
        String result = fizzBuzz.fizzBuzzConverter(4);
        assertThat(result, equalTo("4"));
    }

    @Test
    public void printThreeReturnsFizz() {
        String result = fizzBuzz.fizzBuzzConverter(3);
        assertThat(result, equalTo("Fizz"));
    }

    @Test
    public void printFiveReturnsBuzz() {
        String result = fizzBuzz.fizzBuzzConverter(5);
        assertThat(result, equalTo("Buzz"));
    }

    @Test
    public void printFifteenReturnsFizzBuzz() {
        String result = fizzBuzz.fizzBuzzConverter(15);
        assertThat(result, equalTo("FizzBuzz"));
    }


    @Test
    public void oneHundredOneNotPrinted() {
        MainMethodResult result = invokeMain(fizzBuzz.class);
        assertTrue(false == result.getOut().contains("101"));
    }





}
