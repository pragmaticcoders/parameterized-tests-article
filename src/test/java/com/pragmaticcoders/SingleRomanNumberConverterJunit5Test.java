package com.pragmaticcoders;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SingleRomanNumberConverterJunit5Test {

    private SingleRomanNumberConverter converter = new SingleRomanNumberConverter();

    @ParameterizedTest
    @CsvSource({
            "I, 1",
            "V, 5",
            "X, 10",
            "L, 50",
            "C, 100",
            "D, 500",
            "M, 1000"
    })
    void convertsAllSingleNumbers(String romanNumber, int expectedResult){
        assertThat(converter.convert(romanNumber)).isEqualTo(expectedResult);
    }
}