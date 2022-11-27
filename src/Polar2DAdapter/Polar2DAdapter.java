package Polar2DAdapter;

import Vector2D.IVector;
import Vector2D.Vector2D;

import java.util.ArrayList;

public class Polar2DAdapter implements IPolar2D, IVector
{
    public double abs()
    {
        return this.srcVector.abs();
    }

    public double cdot(IVector param)
    {
        return this.srcVector.cdot(param);
    }

    public ArrayList<Double> getComponents()
    {
        return this.srcVector.getComponents();
    }

    public double getAngle()
    {
        return Math.atan(this.srcVector.getComponents().get(1) / this.srcVector.getComponents().get(0));
    }

    private Vector2D srcVector;
}