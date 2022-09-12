public class BmiService {

    public double calculate(int mass, double growth) {
        double index = mass / (growth * growth);

        return (index);
    }
}
