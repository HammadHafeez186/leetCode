import java.util.Arrays;

public class LeftAndRightSumDiff {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] array = leftRightDifference(nums);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] array = new int[nums.length];
        int sub = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum = leftSum + nums[i];
                left[i] = 0;
            } else {
                left[i] = leftSum;
                leftSum = leftSum + nums[i];

            }
        }
        //15,11,3,0
        int k = 0;
        for (int i=0;i<nums.length;i++){
            if (i == nums.length - 1){
                right[i] = 0;
            }
            while (k < nums.length - 1 ){
                rightSum = nums[k+1] + rightSum;
                k++;
            }
            right[i] = rightSum;
            rightSum = 0;
            k=i+1;
        }


        //New array formation
        for (int i=0;i<nums.length;i++){
            if (left[i]>right[i]){
                sub = left[i]-right[i];
                array[i] = sub;
            }
            else{
                sub = right[i]-left[i];
                array[i] = sub;
            }
        }

        return array;
    }
}

