import java.util.Arrays;

public class TwoSumOfArrays {
    public static void main(String[] args) {
        int target = 4;
        int[] arrayGiven = {1,2,3,4,5};
        int[] array = twoSum(arrayGiven, target);
        System.out.println(Arrays.toString(array));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for(int i=0;i<nums.length;i++)
            for (int j=0;j<nums.length;j++){
                int sum;
                sum = nums[i] + nums[j];
                while (i != j){
                    if (target == sum){
                        array = new int[]{j, i};
                    }
                    break;
                }
            }
        return array;
    }
}
