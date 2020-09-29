public class BodyMassIndex {
    double height;
    double weight;
    //double bmi;

    public BodyMassIndex(double height, double weight){
        this.height = height;
        this.weight = weight;
        //this.bmi = bmi;

    }

    public double findBMI(){
        return 703 * (this.weight / this.height^2);
    }
    //703 * weight / height^2;
}
