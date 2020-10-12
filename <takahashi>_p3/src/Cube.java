public class Cube extends Shape3D{
    private double width;
    private String name;

    public double getArea() {

        return 6 * width * width;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return width * width * width;
    }

    public Cube(double width) {
        this.width = width;
        this.name = "cube";
    }
}
