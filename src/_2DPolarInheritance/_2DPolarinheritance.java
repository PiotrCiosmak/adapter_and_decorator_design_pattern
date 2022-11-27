package _2DPolarInheritance;

import Vector2D.Vector2D;

public class _2DPolarinheritance extends Vector2D
{
    public _2DPolarinheritance(double x, double y)
    {
        super(x, y);
    }

    public double getAngle()
    {
        return Math.atan(getComponents().get(1) / getComponents().get(0));
    }
}