package com.codurance.roman_numeral_converter;

public class RomanNumeralConverter {
  public String call(int number) {
    StringBuilder stringBuilder = new StringBuilder();
    // 11, 12, 13, 15, 16, 17 XI, XII, XIII, XV XVI, XVII
    while (number > 0) {
      if (number >= 10){
        stringBuilder.append("X");
        number -= 10;
      }
      if (number >= 5){
        stringBuilder.append("V");
        number -= 5;
      }else{
        stringBuilder.append("I");
        number--;
      }
    }
    return stringBuilder.toString();
  }
}

