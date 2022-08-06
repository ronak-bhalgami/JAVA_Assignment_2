/**
 * Class_1_Circle
 */
//This program is done by Ronak Bhalgami(21CE009)
public class Class_1_Circle {

    double Radius=1;
    Class_1_Circle(){}
    Class_1_Circle(double Radius)
    {
        this.Radius=Radius;
    }
    public double getArea(double Radius)
    {
        double Area=(3.14)*Radius*Radius;
        return Area;
    }
    public double getPerimeter(double Radius)
    {
        double Perimeter=2*(3.14)*Radius;
        return Perimeter;
    } 
}