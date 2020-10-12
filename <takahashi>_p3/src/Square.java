public class Square extends Shape2D{
    private double width;
    private String name;

    public double getArea() {
        return width *  width;
    }
    public String getName() {
        return name;
    }
    public Square(double width) {
        this.width = width;
        this.name = "square";
    }
}
