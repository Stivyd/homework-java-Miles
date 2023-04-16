public class Main {
    public static void main(String[] args) {
        BonusMiles service = new BonusMiles();
        int cost = 1_000_000;
        int miles = service.calculate(cost);
        System.out.println("Спасибо за покупку. Стоймость перелета = " + cost + " руб. Бонусные мили = " + miles +".");
    }
}