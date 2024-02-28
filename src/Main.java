public class Main {
    public static void main(String[] args) {
        bonusMilesService service = new bonusMilesService();
        int price = 10_000;
        int miles = service.calculate ( 10000 ); // должно получиться 500
        System.out.println (miles);
    }
}
