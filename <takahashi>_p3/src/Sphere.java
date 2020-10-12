public class Sphere extends Shape3D{
    private double radius;
    private String name;

    public String getName() {
        return name;
    }

    public double getArea() {
        return 4 * Math.PI *(radius * radius);
    }

    public double getVolume() {
        return ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
    }

    public Sphere(double radius) {
        this.radius = radius;
        this.name = "sphere";
    }
}
