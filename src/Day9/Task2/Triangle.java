package Day9.Task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    private String color;
    public Triangle(String color, double a, double b, double c){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double area() {
        double p = (a+b+c)/2;
        double geron = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return geron;
    }

    @Override
    public double perimeter() {
        double s = a+b+c;
        return s;
    }
}
