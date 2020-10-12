public class Pyramid extends Shape3D{
    private double width;
    private double length;
    private double heigth;
    private String name;

    public String getName() {
        return name;
    }

    public double getArea() {
        double resultPyramidArea = (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) +
                Math.pow(heigth, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(heigth, 2)));
        return resultPyramidArea;
    }

    public double getVolume() {
        return width * length * heigth / 3;
    }

    public Pyramid(double length, double width, double heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.name = "pyramid";
    }
}
