package com.pragmaticcoders;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SingleRomanNumberConverterJunit4Test {

    private SingleRomanNumberConverter converter = new SingleRomanNumberConverter();

    @Test
    public void converts_I_Number() {
        assertThat(converter.convert("I")).isEqualTo(1);
    }

    @Test
    public void converts_V_Number() {
        assertThat(converter.convert("V")).isEqualTo(5);
    }

    @Test
    public void convertsAllSingleNumbers() {
        assertThat(converter.convert("I")).isEqualTo(1);
        assertThat(converter.convert("V")).isEqualTo(5);
        //...
    }

    @Test
    @Parameters({
            "I, 1",
            "V, 5",
            "X, 10",
            "L, 50",
            "C, 100",
            "D, 500",
            "M, 1000",
    })
    public void convertsAllSingleNumbersParameterized(String romanNumber, int expectedResult){
        assertThat(converter.convert(romanNumber)).isEqualTo(expectedResult);
    }
}