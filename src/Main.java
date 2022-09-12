public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int mass = 78;

        double growth = 1.58;

        double index = service.calculate(mass, growth);

        System.out.println(index);
    }

}
