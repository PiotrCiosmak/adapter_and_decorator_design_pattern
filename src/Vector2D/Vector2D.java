package Vector2D;

import java.util.ArrayList;

public class Vector2D implements IVector
{
    public ArrayList<Double> getComponents()
    {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(x);
        arrayList.add(y);
        return arrayList;
    }

    public double abs()
    {
        return Math.sqrt(x * x + y * y);
    }

    public double cdot(IVector param)
    {
        return x * y + param.getComponents().get(0) * param.getComponents().get(1);
    }

    private double x;
    private double y;
}