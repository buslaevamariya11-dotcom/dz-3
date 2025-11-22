public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price;
        int miles;

        // 1
        price = 10_000;
        miles = service.calculate(price);
        System.out.println(miles);

        //2
        price = 10_025;
        miles = service.calculate(price);
        System.out.println(miles);

        //3
        price = 19;
        miles = service.calculate(price);
        System.out.println(miles);
    }
}
