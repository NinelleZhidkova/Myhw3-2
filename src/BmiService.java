public class BmiService {
    public int calculate (double metr, int kg) {
        double bmi = kg/(metr * metr);
        return (int) bmi;

    }
}
