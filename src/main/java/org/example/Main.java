package org.example;

import org.example.classes.CalculateArea;

import org.example.classes.StringHelper;
import org.example.classes.TypeShape;

public class Main {
    public static void main(String[] args) {

        System.out.println(CalculateArea.calculateArea(TypeShape.RECTANGLE, 2, 3));
        System.out.println(CalculateArea.calculateArea(TypeShape.SQUARE,  5));
        System.out.println(CalculateArea.calculateArea(TypeShape.CIRCLE, 2));

        System.out.println(StringHelper.reverse("ab"));
        System.out.println(StringHelper.encoder("CIELO"));

    }


}

