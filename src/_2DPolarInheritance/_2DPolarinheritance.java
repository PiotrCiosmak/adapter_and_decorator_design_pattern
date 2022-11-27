package _2DPolarInheritance;

import Vector2D.Vector2D;

public class _2DPolarinheritance extends Vector2D
{
    public double getAngle()
    {
        return Math.atan(getComponents().get(0)/abs());
    }
}