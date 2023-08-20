import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{5,0,1,2,4,3};
        System.out.printf(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];
        int i = 0;
        while (i < nums.length) {
            array[i] = nums[nums[i]];
            i++;
        }
        return array;
    }

}
