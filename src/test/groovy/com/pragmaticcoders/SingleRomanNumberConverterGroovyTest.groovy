package com.pragmaticcoders

import spock.lang.Specification
import spock.lang.Unroll

class SingleRomanNumberConverterGroovyTest extends Specification {

    private SingleRomanNumberConverter converter = new SingleRomanNumberConverter()

    @Unroll('converts #romanNumber to #expectedResult')
    def 'converts all single numbers'() {
        expect:
        converter.convert(romanNumber) == expectedResult

        where:
        romanNumber | expectedResult
        "I"         | 1
        "V"         | 5
        "X"         | 10
        "L"         | 50
        "C"         | 100
        "D"         | 500
        "M"         | 1000
    }
}
