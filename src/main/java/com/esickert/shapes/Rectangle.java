package com.esickert.shapes;

/**
 * Created by esickert on 3/30/2017.
 */
public class Rectangle implements Measurable    {

    private double myWidth;
    private double myHeight;

    public Rectangle(double width, double height)     //this is a constructor...not a method!
    {
        myWidth = width;
        myHeight = height;
    }

    public double getParimeter()    {
        return 2 * (myWidth + myHeight);
    }

    public double getArea() {
        return myWidth * myHeight;
    }
}
