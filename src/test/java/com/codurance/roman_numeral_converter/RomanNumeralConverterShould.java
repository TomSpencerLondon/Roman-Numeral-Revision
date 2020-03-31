package com.codurance.roman_numeral_converter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Implement a roman numeral converter.
// The code must be able to take decimals up to 3999 and convert to their
// roman equivalent.
//        Conversion Table
//        1 - I
//        5 - V
//        10 - X
//        50 - L
//        100 - C
//        500 - D
//        1000 - M
//        2499 - MMCDXCIX
//        3949 - MMMCMXLIX
public class RomanNumeralConverterShould {
  @ParameterizedTest
  @CsvSource({
          "1, I",
          "2, II",
          "3, III",
          "4, IV",
          "5, V",
          "6, VI",
          "7, VII",
          "11, XI",
          "12, XII",
          "13, XIII"
  })
  void convert_integer_to_roman_numeral_string(int number, String conversion) {
    RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
    assertEquals(conversion, romanNumeralConverter.call(number));
  }
}
