import Vector3DDecorator.Vector3DDecorator;
import Vector3DInheritance.Vector3DInheritance;
import _2DPolarInheritance._2DPolarinheritance;

public class Main
{
    public static void main(String[] args)
    {
        _2DPolarinheritance vector2D = new _2DPolarinheritance(10, 20);
        Vector3DDecorator vector3DDecorator = new Vector3DDecorator(1, 2, 3);
        Vector3DInheritance vector3DInheritance = new Vector3DInheritance(9, 8, 7);
        System.out.println("WSPÓŁRZĘDNE W UKŁADZIE KARTEZJAŃSKIM");
        System.out.println("WEKTOR 2D");
        System.out.println("x = " + vector2D.getComponents().get(0));
        System.out.println("y = " + vector2D.getComponents().get(1));

        System.out.println("WEKTOR 3D DECORATOR");
        System.out.println("x = " + vector3DDecorator.getComponents().get(0));
        System.out.println("y = " + vector3DDecorator.getComponents().get(1));
        System.out.println("z = " + vector3DDecorator.getComponents().get(2));

        System.out.println("WEKTOR 3D INHERITANCE");
        System.out.println("x = " + vector3DInheritance.getComponents().get(0));
        System.out.println("y = " + vector3DInheritance.getComponents().get(1));
        System.out.println("z = " + vector3DInheritance.getComponents().get(2));

        System.out.println("\nWSPÓŁRZĘDNE W UKŁADZIE BIEGUNOWYM");
        System.out.println("WEKTOR 2D");
        System.out.println("promień wodzący = " + vector2D.abs());
        System.out.println("wartośc kąta = " + vector2D.getAngle());

        System.out.println("\nILOCZYNY SKALARNE");
        System.out.println("WEKTOR 2D z WEKTOR 2D = " + vector2D.cdot(vector2D));
        System.out.println("WEKTOR 3D DECORATOR z WEKTOR 2D = " + vector3DDecorator.cdot(vector2D));
        System.out.println("WEKTOR 3D INHERITANCE z WEKTOR 2D = " + vector3DInheritance.cdot(vector2D));

        System.out.println("\nILOCZYNY WEKTOROWE");
        Vector3DDecorator vector3DDecorator1 = vector3DDecorator.cross(vector2D);
        System.out.println("WEKTOR 3D DECORATOR z WEKTOR 2D:");
        System.out.println("x = " + vector3DDecorator1.getComponents().get(0));
        System.out.println("y = " + vector3DDecorator1.getComponents().get(1));
        System.out.println("z = " + vector3DDecorator1.getComponents().get(2));
        Vector3DInheritance vector3DInheritance1 = vector3DInheritance.cross(vector2D);
        System.out.println("WEKTOR 3D INHERITANCE z WEKTOR 2D:");
        System.out.println("x = " + vector3DInheritance1.getComponents().get(0));
        System.out.println("y = " + vector3DInheritance1.getComponents().get(1));
        System.out.println("z = " + vector3DInheritance1.getComponents().get(2));
    }
}