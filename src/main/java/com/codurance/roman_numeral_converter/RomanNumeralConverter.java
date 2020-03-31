package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
  public String call(int number) {
    StringBuilder stringBuilder = new StringBuilder();
    int remaining = number;

    for (ArabicToRoman arabic : ArabicToRoman.values()){
      while (remaining >= arabic.decimal){
        stringBuilder.append(arabic.roman);
        remaining -= arabic.decimal;
      }
    }

    return stringBuilder.toString();
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

