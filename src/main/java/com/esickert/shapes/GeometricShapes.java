package com.esickert.shapes;

/**
 * Created by esickert on 3/30/2017.
 */
public class GeometricShapes {

    public static void main(String[] args)  {

        Measurable r1 = new Rectangle(4,8);
        Measurable c1 = new Circle(3);


        System.out.println(r1.getParimeter());
        System.out.println(c1.getParimeter());
        System.out.println(r1.getArea());
    }
}
