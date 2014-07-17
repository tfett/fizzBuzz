package edu.pdx.cs410J.tfetters;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Created by tylerfet on 7/16/14.
 */
public class romanNumeralsTest extends InvokeMainTestCase {


    @Test
    public void testStringNumber1() {
        String result = romanNumerals.convert(1);
        assertThat(result, equalTo("I"));
    }

    @Test
    public void testStringNumber2() {
        String result = romanNumerals.convert(2);
        assertThat(result, equalTo("II"));
    }

    @Test
    public void testStringNumber5() {
        String result = romanNumerals.convert(5);
        assertThat(result, equalTo("V"));
    }


    @Test
    public void testStringNumber7() {
        String result = romanNumerals.convert(7);
        assertThat(result, equalTo("VII"));
    }

    @Test
    public void testStringNumber17() {
        String result = romanNumerals.convert(17);
        assertThat(result, equalTo("XVII"));
    }

    @Test
    public void testStringNumber11() {
        String result = romanNumerals.convert(11);
        assertThat(result, equalTo("XI"));
    }

    @Test
    public void testStringNumber1to10() {
        assertThat(romanNumerals.ConvertWrapper("1"), equalTo("I"));
        assertThat(romanNumerals.ConvertWrapper("2"), equalTo("II"));
        assertThat(romanNumerals.ConvertWrapper("3"), equalTo("III"));
        assertThat(romanNumerals.ConvertWrapper("4"), equalTo("IV"));
        assertThat(romanNumerals.ConvertWrapper("5"), equalTo("V"));
        assertThat(romanNumerals.ConvertWrapper("6"), equalTo("VI"));
        assertThat(romanNumerals.ConvertWrapper("7"), equalTo("VII"));
        assertThat(romanNumerals.ConvertWrapper("8"), equalTo("VIII"));
        assertThat(romanNumerals.ConvertWrapper("9"), equalTo("IX"));
        assertThat(romanNumerals.ConvertWrapper("10"), equalTo("X"));

    }

    @Test
    public void testStringNumberCornerCases() {
        assertThat(romanNumerals.ConvertWrapper("40"), equalTo("XL"));
        assertThat(romanNumerals.ConvertWrapper("41"), equalTo("XLI"));
        assertThat(romanNumerals.ConvertWrapper("44"), equalTo("XLIV"));
        assertThat(romanNumerals.ConvertWrapper("99"), equalTo("XCIX"));
        assertThat(romanNumerals.ConvertWrapper("144"), equalTo("CXLIV"));
        assertThat(romanNumerals.ConvertWrapper("498"), equalTo("CDXCVIII"));
        assertThat(romanNumerals.ConvertWrapper("3499"), equalTo("MMMCDXCIX"));


    }

    @Ignore
    @Test
    public void invokingMainWithNoArgumentsHasExitCodeOf0() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(romanNumerals.class);
        assertThat(result.getExitCode(), equalTo(0));
    }

}
