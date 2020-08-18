package Replit_7_26_2020;
import java.util.*;

public class MethodsOverloading1 {




        public int findMax( int[] arr){

            int max = arr[0];
            for (int each : arr) {
                if (each > max) {
                    max = each;
                }
            }
            return max;
        }

        public double findMax ( double[] arr){

            double max = arr[0];
            for (double each : arr) {
                if (each > max) {
                    max = each;
                }
            }
            return max;

    }
}
