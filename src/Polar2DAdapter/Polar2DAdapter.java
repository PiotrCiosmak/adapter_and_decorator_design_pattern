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

    public double getAngle()
    {
        //TODO
        return 0;
    }

    public double cdot(IVector param)
    {
        return this.srcVector.cdot(param);
    }

    public ArrayList<Double> getComponents()
    {
        return this.srcVector.getComponents();
    }

    private Vector2D srcVector;
}