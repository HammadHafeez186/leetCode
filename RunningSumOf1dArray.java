import java.util.Arrays;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int[] sums = runningSum(nums);
        Arrays.stream(sums).forEach((int i)-> {
            System.out.println(i);
        });
    }

    public static int[] runningSum(int[] nums) {
        int i = 0;
        int target = 0;
        int[] n = new int[nums.length];
        while (i < nums.length) {
            target = target + nums[i];
            n[i] = target;
            i++;
        }
        return n;
    }
}

