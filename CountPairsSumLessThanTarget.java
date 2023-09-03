import java.util.ArrayList;
import java.util.List;

public class CountPairsSumLessThanTarget {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        System.out.println(countPairs(nums,3));
    }
    public static int countPairs(List<Integer> nums, int target) {
            int count = 0;
        for (int i=0;i<nums.size();i++) {
            for (int j=i+1;j<nums.size();j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

}
