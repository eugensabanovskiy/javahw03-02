public class BmiService {
    public int bmi(int weightKg, int heightSm) {
        int index = (weightKg * 10000) / (heightSm * heightSm);
        return index;
    }
}
