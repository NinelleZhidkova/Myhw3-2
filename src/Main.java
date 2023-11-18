public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double metr = 178;
        int kg  = 60;
        int bmi = service.calculate(178, 60);
        System.out.println(bmi);
    }
}