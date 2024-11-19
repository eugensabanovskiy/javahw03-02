public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myBmi = service.bmi(98, 187);
        System.out.println(myBmi);
    }
}