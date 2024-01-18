public class Main {
    public static void main(String[] args) {

        int cost = 4976; // стоимость билета
        int bonus = 20; // количество рублей для одной бонусной мили

        int bonusMile = cost / bonus; // количество бонусных миль
        System.out.println(bonusMile);
    }
}