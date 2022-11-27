package Vector3DInheritance;

import Vector2D.IVector;
import Vector2D.Vector2D;

import java.util.ArrayList;

public class Vector3DInheritance extends Vector2D
{
    public Vector3DInheritance(double x, double y, double z)
    {
        super(x, y);
        this.z = z;
    }

    @Override
    public double abs()
    {
        double x = getComponents().get(0);
        double y = getComponents().get(1);
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public double cdot(IVector param)
    {
        return getComponents().get(0) * param.getComponents().get(0) + getComponents().get(1) * param.getComponents().get(1) + z * 0;
    }

    @Override
    public ArrayList<Double> getComponents()
    {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(super.getComponents().get(0));
        arrayList.add(super.getComponents().get(1));
        arrayList.add(z);
        return arrayList;
    }

    public Vector3DInheritance cross(IVector param)
    {
        double newX = getComponents().get(1) * 0 - z * param.getComponents().get(1);
        double newY = -(getComponents().get(0) * 0 - z * param.getComponents().get(0));
        double newZ = getComponents().get(0) * param.getComponents().get(1) - getComponents().get(1) * param.getComponents().get(0);
        return new Vector3DInheritance(newX, newY, newZ);
    }

    public IVector getSrcV()
    {
        return this;
    }

    private double z;
}