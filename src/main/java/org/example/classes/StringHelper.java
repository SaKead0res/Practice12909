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


//    In the StringHelper class create an encoder method that receive a String and returns
//            the String with the vowels changed by numbers. Write all tests.
    public static String encoder(String s){

        if(s.contains("a")||s.contains("A")){
            s = s.replace("a", "4");
            s = s.replace("A", "4");
        }
        if(s.contains("e")||s.contains("E")){
            s = s.replace("e", "3");
            s = s.replace("E", "3");
        }
         if(s.contains("i")||s.contains("I")){
            s = s.replace("i", "1");
            s = s.replace("I", "1");
        }
         if(s.contains("o")||s.contains("O")){
             s = s.replace("o", "0");
             s = s.replace("O", "0");
         }
          if(s.contains("u")||s.contains("U")){
             s = s.replace("u", "9");
             s = s.replace("U", "9");
         }
          return s;
    }
}
