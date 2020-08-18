package Replit_7_26_2020;

import java.util.Scanner;

public class MethodsWithString13 {

    public static boolean isError(String line){

        Scanner scan = new Scanner(System.in);
        String Sentence = scan.nextLine();

        if(Sentence.startsWith("error") ){
            return true;
        }else{
            return false;
        }



    }
}
