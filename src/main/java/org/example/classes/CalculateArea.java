package org.example.classes;




    public class CalculateArea {


        public static double calculateArea(TypeShape shape, double... values) {


            if (TypeShape.RECTANGLE == shape) {
                if (values.length < 2|| values.length > 2) throw new RuntimeException("Rectangle need two edges");
                return values[0] * values[1];
            } else if (TypeShape.SQUARE == shape) {
                if (values.length < 1 || values.length > 1) throw new RuntimeException("Square need one edge");
                return values[0] * values[0];
            } else if (TypeShape.CIRCLE == shape) {
                if (values.length < 1 || values.length > 1) throw new RuntimeException("Circle need radius");
                return (Math.PI * values[0]) * values[0];
            }
            throw new RuntimeException("Shape not allowed");
        }
    }

