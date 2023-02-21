public class Main {
    public static void main(String[] args) {
        MonthService service= new MonthService ();
        int count = service.calculate(10000,3000,20000);
        System.out.println(count);
    }
}