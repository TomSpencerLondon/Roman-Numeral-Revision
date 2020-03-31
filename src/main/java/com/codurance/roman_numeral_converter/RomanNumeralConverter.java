package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
  public String call(int number) {
    StringBuilder stringBuilder = new StringBuilder();
    int remaining = number;
    if (remaining >= 10){
      stringBuilder.append("X");
      remaining -= 10;
    }
    if (remaining >= 5){
      stringBuilder.append("V");
      remaining -= 5;
    }
    if (remaining == 4) {
      stringBuilder.append("IV");
      remaining -= 4;
    }

    for (int i = 0; i < remaining; i++) {
      stringBuilder.append("I");
    }

    return stringBuilder.toString();
  }
}

