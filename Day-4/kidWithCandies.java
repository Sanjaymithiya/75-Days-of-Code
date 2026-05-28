import java.util.*;

public class kidWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // find the maximum candies any kid currently has
        for (int c : candies) {
            maxCandies = Math.max(maxCandies, c);
        }

        // check for each kid if giving extraCandies makes them >= maxCandies
        for (int c : candies) {
            result.add(c + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies1 = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies1, 3)); // [true,true,true,false,true]

        int[] candies2 = {4,2,1,1,2};
        System.out.println(kidsWithCandies(candies2, 1)); // [true,false,false,false,false]

        int[] candies3 = {12,1,12};
        System.out.println(kidsWithCandies(candies3, 10)); // [true,false,true]
    }
}
