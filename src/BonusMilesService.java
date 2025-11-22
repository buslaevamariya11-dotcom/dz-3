public class BonusMilesService {
    public int calculate(int price) {
        final int MILE_COST = 20;
        int miles = price / MILE_COST;
        return miles;
    }
}
