package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
  private final StringBuilder stringBuilder;

  public RomanNumeralConverter() {
    this.stringBuilder = new StringBuilder();
  }

  public String call(int number) {
    if (number <= 0){
      return stringBuilder.toString();
    }

    ArabicToRoman highestValue = findHighestValueFor(number);

    stringBuilder.append(highestValue.roman);
    number -= highestValue.decimal;
    return call(number);
  }

  private ArabicToRoman findHighestValueFor(int number) {
    for (ArabicToRoman arabic : ArabicToRoman.values()){
      if (arabic.decimal <= number){
        return arabic;
      }
    }
    return null;
  }

  public enum ArabicToRoman{
    TEN(10, "X"),
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV"),
    ONE(1, "I");

    public final int decimal;
    public final String roman;

    ArabicToRoman(int decimal, String roman) {
      this.decimal = decimal;
      this.roman = roman;
    }
  }

}

