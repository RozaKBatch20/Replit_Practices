package Replit_7_26_2020;


public class MethodWithString12_ExtractNum {

public static String extractNum(String s ){

    String str = s.trim();
    String digits = "";
    for( int i = 0; i < s.length(); i++) {
        char chrs = str.charAt(i);
        if(Character.isDigit(chrs))
            digits = digits+chrs;
    }
    return digits;
    }







}
