package org.example.classes;

import java.sql.Array;
import java.util.*;

public class StringHelper {

    public static String reverse(String string){
        String[] arr = string.split("");
        String[] rra = new String[arr.length];
        int counter = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            rra[counter] = arr[i];
            counter --;
        }
        String s = "";
        for (int i = 0; i < rra.length; i++) {
            s = s.concat(rra[i]);
        }
        return s;
    }



}
