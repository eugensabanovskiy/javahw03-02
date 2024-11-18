public class BmiService {
    public double bmi(double weight, double height) {
        double index = weight / (height * height);
        int indexInt;
        indexInt = (int)index;
        return indexInt;
    }
}
