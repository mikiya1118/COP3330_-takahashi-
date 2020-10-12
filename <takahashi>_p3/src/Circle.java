public class Circle extends Shape2D {
    private double width;
    private String name;

    public double getArea() {

        return width * width * Math.PI;
    }

    public String getName() {
        return name;
    }
    public Circle(double width) {
        this.width = width;
        this.name = "circle";
    }
}
