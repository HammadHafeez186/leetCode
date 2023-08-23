import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidWithGreatesNumberOfCandies {

    public static void main(String[] args) {

        int[] candies = {5,1,5,5,6};
        int extracandies = 3;

        System.out.println(kidsWithCandies(candies,extracandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] extra = new int[candies.length];
        ArrayList<Boolean> truth = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            extra[i] = candies[i] + extraCandies;
        }
        // returning more values than given error
        for (int i = 0; i < extra.length; i++) {
            if (extra[i] >= Arrays.stream(candies).max().getAsInt()) {
                truth.add(true);
            } else {
                truth.add(false);
            }
        }
        return truth;
    }
}