package com.esickert.shapes;

/**
 * Created by esickert on 3/30/2017.
 */
public class Circle implements Measurable   {

    private double myRadius;

    public Circle(double radius)    {
        myRadius=radius;
    }

    public double getParimeter()    {
        return 2 * Math.PI * myRadius;
    }

    public double getCircumference()    {
        return getParimeter();
    }

    public double getArea() {
        return Math.PI * myRadius * myRadius;
    }

}



