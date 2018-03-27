package com.pragmaticcoders;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SingleRomanNumberConverterJunit5Test {

    private SingleRomanNumberConverter converter = new SingleRomanNumberConverter();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void convertsAllSingleNumbers(String romanNumber, int expectedResult){
        assertThat(converter.convert(romanNumber)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("V", 5),
                Arguments.of("X", 10),
                Arguments.of("L", 50),
                Arguments.of("C", 100),
                Arguments.of("D", 500),
                Arguments.of("M", 1000)
        );
    }
}