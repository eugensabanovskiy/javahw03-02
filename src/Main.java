public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.bmi(98,1.87);
        int finalBmi;
        finalBmi = (int)myBmi;
        System.out.println(finalBmi);
    }
}