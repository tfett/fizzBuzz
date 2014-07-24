package edu.pdx.cs410J.tfetters;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for the fizzBuzz class.  These tests extend <code>InvokeMainTestCase</code>
 * which allows them to easily invoke the <code>main</code> method of <code>fizzBuzz</code>.
 * They also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>matchers
 * for more readable assertion statements.
 */
public class PacManTest extends InvokeMainTestCase
{

    @Test
    public void testPixelConstruct() {
        PacManPixel pmp = new PacManPixel();
        pmp.setpixeltype(pixeltype.dot);
        assertThat(pmp.gettype(), equalTo(pixeltype.dot));
    }


    @Test
    public void testBoardConstruct() {
        PacManBoard board = new PacManBoard();
        board.setBoardSize(4);
        assertThat(board.getBoardSize(), equalTo(4));
    }

    @Test
    public void testpixelfetch() {
        PacManBoard board = new PacManBoard();
        board.setBoardSize(4);
        for (int i=0; i<16; i++) {
            board.setPixelOnBoard(i, pixeltype.dot);
        }
        assertThat(board.getpixeltype(3, 2), equalTo(pixeltype.dot));
    }




}
