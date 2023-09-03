public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] shuffle = shuffle(nums, 3);
        for (int i : shuffle) {
            System.out.println(i);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        // time limit exceeded
        int i = 0;
        int j = n;
        int k = 0;
        int[] concat = new int[nums.length];
        while (k < nums.length) {
            concat[k] = nums[i];
            k++;
            concat[k] = nums[j];
            k++;
            i++;
            j++;
        }
        return concat;
    }
}
