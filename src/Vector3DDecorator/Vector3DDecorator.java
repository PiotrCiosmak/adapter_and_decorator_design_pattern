package Vector3DDecorator;

import Vector2D.IVector;

import java.util.ArrayList;

public class Vector3DDecorator implements IVector
{
    Vector3DDecorator(double x, double y, double z)
    {
        //TODO ustawić srcVector jakiś x i y
        this.srcVector.setX(x);
        this.srcVector.setY(x);
        this.z = z;
    }

    public double abs()
    {
        double x = this.srcVector.getComponents().get(0);
        double y = this.srcVector.getComponents().get(1);
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double cdot(IVector param)
    {
        return this.srcVector.getComponents().get(0) * param.getComponents().get(0) + this.srcVector.getComponents().get(1) * param.getComponents().get(1) + z * 0;
    }

    public ArrayList<Double> getComponents()
    {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(this.srcVector.getComponents().get(0));
        arrayList.add(this.srcVector.getComponents().get(1));
        arrayList.add(z);
        return arrayList;
    }

    public Vector3DDecorator cross(IVector param)
    {
        double newX = this.srcVector.getComponents().get(1) * 0 - z * param.getComponents().get(1);
        double newY = -(this.srcVector.getComponents().get(0) * 0 - z * param.getComponents().get(0));
        double newZ = this.srcVector.getComponents().get(0) * param.getComponents().get(1) - this.srcVector.getComponents().get(1) * param.getComponents().get(0);
        return new Vector3DDecorator(newX, newY, newZ);
    }

    public IVector getSrcV()
    {
        return srcVector;
    }

    private IVector srcVector;
    private double z;
}