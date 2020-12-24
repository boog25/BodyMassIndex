public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(60,1.70);
        System.out.println(index);
    }
}
