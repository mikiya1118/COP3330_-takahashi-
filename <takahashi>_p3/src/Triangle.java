public class Triangle extends Shape2D{
    private double width;
    private double length;
    private String name;

    public double getArea() {
        return width * length / 2;
    }


    public String getName() {
        return name;
    }
    public Triangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.name = "triangle";
    }
}
